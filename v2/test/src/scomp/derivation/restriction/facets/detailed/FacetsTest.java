/*   Copyright 2004 The Apache Software Foundation
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package scomp.derivation.restriction.facets.detailed;

import scomp.common.BaseCase;
import xbean.scomp.derivation.facets.facets.*;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.util.TimeZone;

import org.apache.xmlbeans.XmlErrorCodes;

/**
 * Date: Oct 25, 2004
 * Time: 1:23:08 PM
 *
 * @owner ykadiysk
 */
public class FacetsTest extends BaseCase {

    public void testMinMaxInclusiveElt() throws Throwable {
        MinMaxInclusiveEltDocument doc =
                MinMaxInclusiveEltDocument.Factory.newInstance();
        doc.setMinMaxInclusiveElt(3);
        try {
            assertTrue(doc.validate(validateOptions));
        } catch (Throwable t) {
            showErrors();
            throw t;
        }
        String[] errExpected = new String[]{
            XmlErrorCodes.DATATYPE_MIN_INCLUSIVE_VALID};

        doc.setMinMaxInclusiveElt(1);
        assertTrue(!doc.validate(validateOptions));
        assertTrue(compareErrorCodes(errExpected));

        clearErrors();
        errExpected = new String[]{
            XmlErrorCodes.DATATYPE_MAX_INCLUSIVE_VALID};
        doc.setMinMaxInclusiveElt(11);
        assertTrue(!doc.validate(validateOptions));
        assertTrue(compareErrorCodes(errExpected));

    }

    public void testMinMaxInclusiveDateElt() throws Throwable {
        MinMaxInclusiveDateEltDocument doc =
                MinMaxInclusiveDateEltDocument.Factory.newInstance();
        TimeZone tz = TimeZone.getDefault();
        Calendar c = new GregorianCalendar(tz);
        c.set(2003, 11, 24);
        doc.setMinMaxInclusiveDateElt(c);
        try {
            assertTrue(doc.validate(validateOptions));
        } catch (Throwable t) {
            showErrors();
            throw t;
        }
        c = new GregorianCalendar(2003, 11, 28);
        doc.setMinMaxInclusiveDateElt(c);
        String[] errExpected = new String[]{
            XmlErrorCodes.DATATYPE_MAX_INCLUSIVE_VALID};
        assertTrue(!doc.validate(validateOptions));
        assertTrue(compareErrorCodes(errExpected));


    }

    public void testMinMaxExclusiveElt() throws Throwable {
        MinMaxExclusiveEltDocument doc =
                MinMaxExclusiveEltDocument.Factory.newInstance();
        String[] errExpected = new String[]{
            XmlErrorCodes.DATATYPE_LENGTH_VALID$LIST_LENGTH};

        doc.setMinMaxExclusiveElt(3);
        assertTrue(!doc.validate(validateOptions));
        assertTrue(compareErrorCodes(errExpected));
        doc.setMinMaxExclusiveElt(1);
        try {
            assertTrue(doc.validate(validateOptions));
        } catch (Throwable t) {
            showErrors();
            throw t;
        }
        doc.setMinMaxExclusiveElt(11);
        try {
            assertTrue(doc.validate(validateOptions));
        } catch (Throwable t) {
            showErrors();
            throw t;
        }

    }

    public void testMinMaxExclusiveDateElt() throws Throwable {
        MinMaxExclusiveDateEltDocument doc = MinMaxExclusiveDateEltDocument.Factory.newInstance();
        Calendar c = new GregorianCalendar(2003, 11, 24);
        doc.setMinMaxExclusiveDateElt(c);
        String[] errExpected = new String[]{
            XmlErrorCodes.DATATYPE_MAX_EXCLUSIVE_VALID};
        assertTrue(!doc.validate(validateOptions));
        assertTrue(compareErrorCodes(errExpected));

        c = new GregorianCalendar(2003, 11, 28);
        doc.setMinMaxExclusiveDateElt(c);
        try {
            assertTrue(doc.validate(validateOptions));
        } catch (Throwable t) {
            showErrors();
            throw t;
        }


    }

    public void testLengthElt() throws Throwable {
        LengthEltDocument doc = LengthEltDocument.Factory.newInstance();
        doc.setLengthElt("foobar");
        String[] errExpected = new String[]{
            XmlErrorCodes.DATATYPE_LENGTH_VALID$STRING};

        assertTrue(!doc.validate(validateOptions));
        assertTrue(compareErrorCodes(errExpected));

        doc.setLengthElt("f");
        clearErrors();
        assertTrue(!doc.validate(validateOptions));
        assertTrue(compareErrorCodes(errExpected));

        doc.setLengthElt("fo");
        try {
            assertTrue(doc.validate(validateOptions));
        } catch (Throwable t) {
            showErrors();
            throw t;
        }
    }

    public void testMinMaxLengthElt() throws Throwable {
        MinMaxLengthEltDocument doc = MinMaxLengthEltDocument.Factory.newInstance();
        String[] errExpected = new String[]{
            XmlErrorCodes.DATATYPE_MAX_LENGTH_VALID$STRING};

        doc.setMinMaxLengthElt("foobar");
        assertTrue(!doc.validate(validateOptions));
        assertTrue(compareErrorCodes(errExpected));

        doc.setMinMaxLengthElt("f");
        errExpected = new String[]{
            XmlErrorCodes.DATATYPE_MIN_LENGTH_VALID$STRING};
        clearErrors();
        assertTrue(!doc.validate(validateOptions));
        assertTrue(compareErrorCodes(errExpected));

        doc.setMinMaxLengthElt("fo");
        try {
            assertTrue(doc.validate(validateOptions));
        } catch (Throwable t) {
            showErrors();
            throw t;
        }
        doc.setMinMaxLengthElt("fooba");
        try {
            assertTrue(doc.validate(validateOptions));
        } catch (Throwable t) {
            showErrors();
            throw t;
        }

    }

    public void testDigitsElt() throws Throwable {
        DigitsEltDocument doc = DigitsEltDocument.Factory.newInstance();
        String[] errExpected = new String[]{
            XmlErrorCodes.DATATYPE_TOTAL_DIGITS_VALID};

        doc.setDigitsElt(new BigDecimal("234.5"));
        assertTrue(!doc.validate(validateOptions));
        assertTrue(compareErrorCodes(errExpected));

        doc.setDigitsElt(new BigDecimal("12.3"));
        try {
            assertTrue(doc.validate(validateOptions));
        } catch (Throwable t) {
            showErrors();
            throw t;
        }
        clearErrors();
        errExpected = new String[]{
            XmlErrorCodes.DATATYPE_FRACTION_DIGITS_VALID};
        doc.setDigitsElt(new BigDecimal(".45"));
        assertTrue(!doc.validate(validateOptions));
        assertTrue(compareErrorCodes(errExpected));

    }

    public void testWSElt() throws Throwable {
        fail("do this test");
    }

    public void testEnumElt() throws Throwable {
        EnumEltDocument doc = EnumEltDocument.Factory.newInstance();
        doc.setEnumElt(EnumT.A);
        try {
            assertTrue(doc.validate(validateOptions));
        } catch (Throwable t) {
            showErrors();
            throw t;
        }
        doc = EnumEltDocument.Factory.parse("<EnumElt xmlns=\"http://xbean/scomp/derivation/facets/Facets\">" +
                "foo" +
                "</EnumElt>");
        String[] errExpected = new String[]{
            XmlErrorCodes.DATATYPE_ENUM_VALID};

        assertTrue(!doc.validate(validateOptions));
        assertTrue(compareErrorCodes(errExpected));

    }

    public void testPatternElt() throws Throwable {
        PatternEltDocument doc = PatternEltDocument.Factory.newInstance();
        doc.setPatternElt("aedaedaed");
        try {
            assertTrue(doc.validate(validateOptions));
        } catch (Throwable t) {
            showErrors();
            throw t;
        }
        String[] errExpected = new String[]{
            XmlErrorCodes.DATATYPE_VALID$PATTERN_VALID};

        doc.setPatternElt("abdadad");
        assertTrue(!doc.validate(validateOptions));
        assertTrue(compareErrorCodes(errExpected));


    }
}