fun main() {
    val user = UsersName("Abhinav", "Thakur", 21)

    user.favouriteMovie = "Intersteller"
    println(user.favouriteMovie)
}

class UsersName(var firstName: String, var lastName: String, var age: Int){
    lateinit var favouriteMovie: String
}