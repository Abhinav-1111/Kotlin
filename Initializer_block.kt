fun main() {
    var user = User("Abhinav", "Thakur",  23)
    var friend = User("Raushan", "Thakur",  23)

    println("Name : ${friend.name}")
}

class User( name: String, var lastName: String, var age: Int){
    var name: String

    init {
        if (name.lowercase().startsWith("a")){
            this.name = name
        }else{
            this.name = "User"
            println("This name doesn't start with the letter 'a' or 'A'")
        }
    }
}