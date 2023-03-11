fun main() {
//    val instance = Database.getInstance()
//    val instance2 = Database.getInstance()

    println(Database)
    println(Database)
}

//class Database private constructor(){
//    companion object{
//        private var instance: Database? = null
//
//        fun getInstance(): Database? {
//            if (instance == null){
//                instance = Database()
//            }
//
//            return instance
//        }
//    }
//}

object Database{
    init {
        println("Database Created")
    }
}