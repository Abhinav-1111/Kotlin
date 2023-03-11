fun main() {
    var user = UserName("Abhinav")
    var friend = UserName("Raushan", "Thakur")
    var user2 = UserName(age = 0, firstName = "Raushan", lastName = "Thakur")

    println("Name : ${user.firstName}")
    println("LastName : ${user.lastName}")
    println("Age : ${user.age}")

    println("\n")

    println("Name : ${friend.firstName}")
    println("LastName : ${friend.lastName}")
    println("Age : ${friend.age}")

    println("\n")

    println("Name : ${user2.firstName}")
    println("LastName : ${user2.lastName}")
    println("Age : ${user2.age}")
}

class UserName(var firstName: String, var lastName: String = "LastName", var age: Int = 0){


}