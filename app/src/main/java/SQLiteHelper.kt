import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class SQLiteHelper private constructor(context: Context) : SQLiteOpenHelper(context, DB_NAME, null, DB_VERSION){

    companion object{
        private val DB_NAME = "mydb"
        private val DB_VERSION = 1
        private var sqliteHelper: SQLiteHelper? = null
        @Synchronized
        fun getInstance(c: Context): SQLiteHelper {
            return if (sqliteHelper == null){
                SQLiteHelper (c.applicationContext)
            }
            else{
                sqliteHelper!!
            }
        }
    }

    override fun onCreate(db: SQLiteDatabase) {
        var sql = """CREATE TABLE emergency_call (_id INTEGER PRIMARY KEY AUTOINCREMENT, username TEXT, password TEXT UNIQUE)"""
        db.execSQL(sql)
        sql = """INSERT INTO emergency_call (_id, username, password) 
            VALUES (null, 'Relawadee', '1234'),(null, 'Nakarinton','4567','Kritsara','7890'),(null,'Peekunda','4321'),(null,'Ralana','7654')"""
        db.execSQL(sql)
    }

    override fun onUpgrade(db: SQLiteDatabase, v1: Int, v2: Int) {
        TODO("Not yet implemented")
    }
}