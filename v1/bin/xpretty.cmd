@echo off

@rem Invokes pretty printer

setlocal
if "%XMLBEANS_HOME%" EQU "" (set XMLBEANS_HOME=%~dp0..)

set cp=
set cp=%cp%;%XMLBEANS_HOME%\build\ar\xbean.jar

java -classpath %cp% org.apache.xmlbeans.impl.tool.PrettyPrinter %*