
import net.lulli.metadao.api.MetaDto

import net.lulli.metadao.helper.sqlite.SQLitePersistenceManager
import scala.collection.mutable.HashTable
import scala.collection.mutable.HashTable
import scala.collection.mutable.HashMap
import net.lulli.metadao.helper.generic.TypeHelper

class Pm extends SQLitePersistenceManager{
}

object DbWriter{

	def main(args: Array[String]): Unit = {
                var dto = MetaDto.getNewInstance("AOOO")
                dto.put("id", "123")
                dto.put("uno","campoY")
                dto.put("due","campoZ")
                dto.put("tre","campoW")
                
                //var pm = new SQLitePersistenceManager()
                var pm = new Pm()
                var wheres = TypeHelper.add(null, "due", "campoY")
                
                pm.execute("create table AOOO ( id char(32), uno text, due text, tre text, quattro text)")
                pm.save(dto, wheres)
        }
}
