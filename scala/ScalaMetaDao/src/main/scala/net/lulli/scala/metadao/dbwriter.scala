package net.lulli.scala.metadao

import net.lulli.metadao.api.MetaDto

import net.lulli.metadao.helper.sqlite.SQLitePersistenceManager
import scala.collection.mutable.HashTable
import scala.collection.mutable.HashTable
import scala.collection.mutable.HashMap
import net.lulli.metadao.helper.generic.TypeHelper

object DbWriter{
	def main(args: Array[String]): Unit = {
		var dbName =""
		if (args.length == 1) {
			dbName = args(0)
		} else {
			dbName = "zero.db"
		}
                var dto = MetaDto.getNewInstance("AOOO")
                dto.put("id", "123")
                dto.put("uno","campoY")
                dto.put("due","campoZ")
                dto.put("tre","campoW")
                
                var pm = new SQLitePersistenceManager(dbName)
                //var pm = new Pm()
                pm.execute("create table AOOO ( id char(32), uno text, due text, tre text, quattro text)")
                var wheres = TypeHelper.add(null, "due", "campoY")
                pm.save(dto, wheres)
        }
}
