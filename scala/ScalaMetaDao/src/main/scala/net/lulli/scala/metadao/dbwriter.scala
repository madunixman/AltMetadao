package net.lulli.scala.metadao

import net.lulli.metadao.api.MetaDto
import net.lulli.metadao.helper.sqlite.SQLitePersistenceManager
import scala.collection.mutable.HashTable
import scala.collection.mutable.HashTable
import scala.collection.mutable.HashMap

class DbConnection extends SQLitePersistenceManager() {

  def initialize() {
    execute(
      "create table posts ( id char(32), content text, mod_time char(32))"
    )
  }
}

object DbWriter {

  def getUuid = java.util.UUID.randomUUID.toString

  def getTimestamp = {
    val long_template = "yyyy-MM-dd'T'HH:mm:ss.SSSZ"
    val short_template = "yyyy-MM-dd"
    val format = new java.text.SimpleDateFormat(long_template)
    format.format(new java.util.Date())
  }

  def main(args: Array[String]): Unit = {
    var pm = new DbConnection()
    pm.initialize()
    var post = MetaDto.getNewInstance("posts")
    val id_post = getUuid
    post.put("id", id_post)
    print("> ")
    var content = scala.io.StdIn.readLine()
    post.put("content", content)
    var tstamp = getTimestamp.toString
    post.put("mod_time", tstamp)

    pm.insert(post)
    sys.exit(0)
  }
}
