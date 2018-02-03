package net.lulli.groovy.prova

import net.lulli.metadao.model.*
import net.lulli.metadao.helper.*
import net.lulli.metadao.helper.sqlite.SQLitePersistenceManager

def dto = MetaDto.getNewInstance("AOOO")
dto['id']="123";
dto['uno']="campoY";
dto['due']="DUE";
dto['tre']="TRE";
dto['quattro']="Q4";

def pm = new SQLitePersistenceManager()
def wheres = new Hashtable()
wheres['uno']="campoY"
pm.execute("create table AOOO ( id char(32), uno text, due text, tre text, quattro text)")
pm.save(dto,wheres)

