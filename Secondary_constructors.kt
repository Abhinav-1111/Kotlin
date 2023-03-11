fun main() {
    var user = Users("Abhinav")
    var friend = Users("Raushan", "Thakur")

    println("Name : ${user.name}")
    println("LastName : ${user.lastName}")
    println("Age : ${user.age}")

    println("\n")

    println("Name : ${friend.name}")
    println("LastName : ${friend.lastName}")
    println("Age : ${friend.age}")
}

class Users(var name: String, var lastName: String, var age: Int){

    constructor(name: String): this(name, "Lastname", 0){
        println("2nd")
    }

    constructor(name: String, lastName: String): this(name, lastName, 0){
        println("3rd")
    }
}