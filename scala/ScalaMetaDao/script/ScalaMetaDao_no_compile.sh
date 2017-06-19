#! /bin/bash

cd $(dirname $0)

MAINFILE=../src/main/scala/net/lulli/scala/metadao/dbwriter.scala
MAINCLASS=net.lulli.scala.metadao.DbWriter

SRCDIR=../src/main/scala
BUILDDIR=../classes
TARGETDIR=../target
LIBDIR=../lib

CP=${CP}:${LIBDIR}/log4j-1.2.17.jar
CP=${CP}:${LIBDIR}/metadao-1.0.2.jar
CP=${CP}:${LIBDIR}/scala-library-2.11.6.jar
CP=${CP}:${LIBDIR}/scala-reflect-2.11.2.jar
CP=${CP}:${LIBDIR}/scalatest_2.11-2.2.5.jar
CP=${CP}:${LIBDIR}/scala-xml_2.11-1.0.2.jar
CP=${CP}:${LIBDIR}/sqlite-jdbc-3.15.1.jar

CP=${CP}:${SRCDIR}

test -d ${BUILDDIR} || mkdir -p ${BUILDDIR}
scalac -cp ${CP} -d ${BUILDDIR} ${MAINFILE}
CP=${CP}:${BUILDDIR}
scala -classpath ${CP} ${MAINCLASS}
