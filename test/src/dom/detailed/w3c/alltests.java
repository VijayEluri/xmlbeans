
/*
This Java source file was generated by test-to-java.xsl
and is a derived work from the source document.
The source document contained the following notice:


Copyright (c) 2001-2003 World Wide Web Consortium,
(Massachusetts Institute of Technology, Institut National de
Recherche en Informatique et en Automatique, Keio University). All
Rights Reserved. This program is distributed under the W3C's Software
Intellectual Property License. This program is distributed in the
hope that it will be useful, but WITHOUT ANY WARRANTY; without even
the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
PURPOSE.
See W3C License http://www.w3.org/Consortium/Legal/ for more details.

*/

//package org.w3c.domts.level2.core;
package dom.detailed.w3c;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.w3c.domts.level2.core.*;


/**
*  Test suite
*  @author W3C DOM Test Working Group
**/
@RunWith(Suite.class)
@Suite.SuiteClasses({
    //  attrgetownerelement01.class,
    attrgetownerelement02.class,
    attrgetownerelement03.class,
    //  attrgetownerelement04.class,
    attrgetownerelement05.class,
    createAttributeNS01.class,
    createAttributeNS02.class,
    createAttributeNS03.class,
    createAttributeNS04.class,
    createAttributeNS05.class,
    createDocument01.class,
    createDocument02.class,
    //    createDocument03.class,
    //  createDocument04.class,
    createDocument05.class,
    createDocument06.class,
    createDocument07.class,
    //   createDocumentType01.class,
    //  createDocumentType02.class,
    //   createDocumentType03.class,
    createElementNS01.class,
    createElementNS02.class,
    createElementNS03.class,
    createElementNS04.class,
    createElementNS05.class,
    documentcreateattributeNS01.class,
    documentcreateattributeNS02.class,
    documentcreateattributeNS03.class,
    documentcreateattributeNS04.class,
    documentcreateattributeNS05.class,
    documentcreateattributeNS06.class,
    documentcreateattributeNS07.class,
    documentcreateelementNS01.class,
    documentcreateelementNS02.class,
    documentcreateelementNS05.class,
    documentcreateelementNS06.class,
    //  documentgetelementbyid01.class,
    documentgetelementsbytagnameNS01.class,
    documentgetelementsbytagnameNS02.class,
    documentgetelementsbytagnameNS03.class,
    documentgetelementsbytagnameNS04.class,
    documentgetelementsbytagnameNS05.class,
    documentimportnode01.class,
    // documentimportnode02.class,
    // documentimportnode03.class,
    //  documentimportnode04.class,
    documentimportnode05.class,
    documentimportnode06.class,
    //  documentimportnode07.class,
    //  documentimportnode08.class,
    documentimportnode09.class,
    documentimportnode10.class,
    documentimportnode11.class,
    documentimportnode12.class,
    documentimportnode13.class,
    documentimportnode14.class,
    documentimportnode15.class,
    documentimportnode17.class,
    documentimportnode18.class,
    // documentimportnode19.class,
    // documentimportnode20.class,
    // documentimportnode21.class,
    //  documentimportnode22.class,
    //  documenttypeinternalSubset01.class,
    // documenttypepublicid01.class,
    //  documenttypesystemid01.class,
    domimplementationcreatedocument03.class,
    domimplementationcreatedocument04.class,
    domimplementationcreatedocument05.class,
    domimplementationcreatedocument07.class,
    //   domimplementationcreatedocumenttype01.class,
    // domimplementationcreatedocumenttype02.class,
    //  domimplementationcreatedocumenttype04.class,
    // domimplementationfeaturecore.class,
    //  domimplementationfeaturexmlversion2.class,
    //  domimplementationhasfeature01.class,
    //  domimplementationhasfeature02.class,
    elementgetattributenodens01.class,
    elementgetattributenodens02.class,
    // elementgetattributenodens03.class,
    // elementgetattributens02.class,
    elementgetelementsbytagnamens02.class,
    elementgetelementsbytagnamens04.class,
    elementgetelementsbytagnamens05.class,
    elementhasattribute01.class,
    //   elementhasattribute02.class,
    elementhasattribute03.class,
    elementhasattribute04.class,
    elementhasattributens01.class,
    elementhasattributens02.class,
    elementhasattributens03.class,
    elementremoveattributens01.class,
    elementsetattributenodens01.class,
    elementsetattributenodens02.class,
    elementsetattributenodens03.class,
    elementsetattributenodens04.class,
    elementsetattributenodens05.class,
    //  elementsetattributenodens06.class,
    elementsetattributens01.class,
    elementsetattributens02.class,
    elementsetattributens03.class,
    elementsetattributens04.class,
    elementsetattributens05.class,
    elementsetattributens08.class,
    elementsetattributensurinull.class,
    // getAttributeNS01.class,
    getAttributeNS02.class,
    getAttributeNS03.class,
    getAttributeNS04.class,
    getAttributeNS05.class,
    getAttributeNodeNS01.class,
    getAttributeNodeNS02.class,
    //  getElementById01.class,
    // getElementById02.class,
    //  getElementsByTagNameNS01.class,
    getElementsByTagNameNS02.class,
    getElementsByTagNameNS03.class,
    getElementsByTagNameNS04.class,
    getElementsByTagNameNS05.class,
    getElementsByTagNameNS06.class,
    getElementsByTagNameNS07.class,
    getElementsByTagNameNS08.class,
    getElementsByTagNameNS09.class,
    getElementsByTagNameNS10.class,
    getElementsByTagNameNS11.class,
    getElementsByTagNameNS12.class,
    getElementsByTagNameNS13.class,
    getElementsByTagNameNS14.class,
    getNamedItemNS01.class,
    getNamedItemNS02.class,
    //  getNamedItemNS03.class,
    //  getNamedItemNS04.class,
    hasAttribute01.class,
    hasAttribute02.class,
    hasAttribute03.class,
    hasAttribute04.class,
    hasAttributeNS01.class,
    hasAttributeNS02.class,
    hasAttributeNS03.class,
    // hasAttributeNS04.class,
    hasAttributeNS05.class,
    hasAttributes01.class,
    hasAttributes02.class,
    hc_attrcreatedocumentfragment.class,
    hc_attrname.class,
    hc_documentcreateattribute.class,
    hc_elementgetattributenode.class,
    //    hc_entitiesremovenameditemns1.class,
    //   hc_entitiessetnameditemns1.class,
    hc_namednodemapgetnameditem.class,
    hc_nodedocumentfragmentnormalize1.class,
    hc_nodedocumentfragmentnormalize2.class,
    //   hc_notationsremovenameditemns1.class,
    //     hc_notationssetnameditemns1.class,
    //    ibmtests.class,
    //   importNode01.class,
    //  importNode02.class,
    importNode03.class,
    importNode04.class,
    //    importNode05.class,
    //   importNode06.class,
    importNode07.class,
    importNode08.class,
    //  importNode09.class,
    //  importNode10.class,
    //  importNode11.class,
    //  importNode12.class,
    // importNode13.class,
    importNode14.class,
    importNode15.class,
    // importNode16.class,
    importNode17.class,
    // internalSubset01.class,
    isSupported01.class,
    isSupported02.class,
    isSupported04.class,
    isSupported05.class,
    isSupported06.class,
    isSupported07.class,
    isSupported09.class,
    isSupported10.class,
    isSupported11.class,
    isSupported12.class,
    isSupported13.class,
    isSupported14.class,
    localName01.class,
    localName02.class,
    localName03.class,
    localName04.class,
    // namednodemapgetnameditemns01.class,
    namednodemapgetnameditemns02.class,
    namednodemapgetnameditemns03.class,
    namednodemapgetnameditemns04.class,
    namednodemapgetnameditemns05.class,
    namednodemapgetnameditemns06.class,
    namednodemapremovenameditemns01.class,
    //default Attr
    // namednodemapremovenameditemns02.class,
    // ER
    //  namednodemapremovenameditemns03.class,
    namednodemapremovenameditemns04.class,
    // namednodemapremovenameditemns05.class,
    namednodemapremovenameditemns06.class,
    namednodemapremovenameditemns07.class,
    namednodemapremovenameditemns08.class,
    namednodemapremovenameditemns09.class,
    namednodemapsetnameditemns01.class,
    namednodemapsetnameditemns02.class,
    namednodemapsetnameditemns03.class,
    namednodemapsetnameditemns04.class,
    //  namednodemapsetnameditemns05.class,
    namednodemapsetnameditemns06.class,
    namednodemapsetnameditemns07.class,
    namednodemapsetnameditemns08.class,
    //  namednodemapsetnameditemns09.class,
    // namednodemapsetnameditemns10.class,
    // namednodemapsetnameditemns11.class,
    namespaceURI01.class,
    namespaceURI02.class,
    namespaceURI03.class,
    namespaceURI04.class,
    nodegetlocalname03.class,
    nodegetnamespaceuri03.class,
    //   nodegetownerdocument01.class,
    nodegetownerdocument02.class,
    nodegetprefix03.class,
    nodehasattributes01.class,
    //  nodehasattributes02.class,
    nodehasattributes03.class,
    nodehasattributes04.class,
    //  nodeissupported01.class,
    // nodeissupported02.class,
    // nodeissupported03.class,
    // nodeissupported04.class,
    // nodeissupported05.class,
    // nodenormalize01.class,
    nodesetprefix01.class,
    nodesetprefix02.class,
    nodesetprefix03.class,
    // nodesetprefix04.class,
    nodesetprefix05.class,
    nodesetprefix06.class,
    nodesetprefix07.class,
    nodesetprefix08.class,
    nodesetprefix09.class,
    normalize01.class,
    ownerDocument01.class,
    ownerElement01.class,
    ownerElement02.class,
    prefix01.class,
    prefix02.class,
    prefix03.class,
    prefix04.class,
    prefix05.class,
    prefix06.class,
    prefix07.class,
    //  prefix08.class,
    prefix09.class,
    prefix10.class,
    prefix11.class,
    //  publicId01.class,
    //  removeAttributeNS01.class,
    //   removeAttributeNS02.class,
    removeNamedItemNS01.class,
    removeNamedItemNS02.class,
    removeNamedItemNS03.class,
    setAttributeNS01.class,
    setAttributeNS02.class,
    //Test makes no sense w/o ER
    //  setAttributeNS03.class,
    setAttributeNS04.class,
    setAttributeNS05.class,
    setAttributeNS06.class,
    setAttributeNS07.class,
    setAttributeNS09.class,
    setAttributeNodeNS01.class,
    //Test makes no sense w/o ER
    // setAttributeNodeNS02.class,
    setAttributeNodeNS03.class,
    setAttributeNodeNS04.class,
    setAttributeNodeNS05.class,
    setNamedItemNS01.class,
    setNamedItemNS02.class,
    setNamedItemNS03.class,
    //Test makes no sense w/o ER
    //  setNamedItemNS04.class,
    setNamedItemNS05.class,
    //    systemId01.class,
})
public class alltests {
   /**
    *  Gets URI that identifies the test suite
    *  @return uri identifier of test suite
    */
   public String getTargetURI() {
      return "http://www.w3.org/2001/DOM-Test-Suite/level2/core/alltests";
   }
}
