fun main() {
    val user1 = Janta("Abhinav", "Thakur", 21)
    val user2 : Janta by lazy {
        Janta("User1", "lastName", 0)
    }

    println(user2.firstName)
}

class Janta(var firstName: String, var lastName: String, var age: Int){
    init {
        println("User: $firstName was created")
    }
}