#! /bin/bash

cd $(dirname $0)

TARGETDIR=../target
LIBDIR=../lib

CP=${CP}:${LIBDIR}/log4j-1.2.17.jar
CP=${CP}:${LIBDIR}/metadao-1.0.2.jar
CP=${CP}:${LIBDIR}/scala-library-2.11.12.jar
CP=${CP}:${LIBDIR}/scala-reflect-2.11.2.jar
CP=${CP}:${LIBDIR}/scalatest_2.11-2.2.5.jar
CP=${CP}:${LIBDIR}/scala-xml_2.11-1.0.2.jar
CP=${CP}:${LIBDIR}/sqlite-jdbc-3.15.1.jar
CP=${CP}:${TARGETDIR}/ScalaMetaDao-0.0.1.jar


java -cp ${CP} net.lulli.scala.metadao.DbWriter
