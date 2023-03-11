fun main() {
    var user = UserNames("Abhinav")
    var friend = UserNames("Raushan", "Thakur")
    var user2 = UserNames(age = 0, firstName = "Raushan", lastName = "Thakur")

    user.firstName = "vlad"

    println(user.firstName)
    println(user.lastName)
    println(user.age)

    println("\n")

    println(friend.firstName)
    println(friend.lastName)
    println(friend.age)

    println("\n")

    println(user2.firstName)
    println(user2.lastName)
    println(user2.age)
}

class UserNames(firstName: String, var lastName: String = "LastName", var age: Int = 0){
    var firstName = firstName
        get() {
            return "FirstName: $field"
        }
        set(value) {
            println("$value was assigned to firstName property")
            field = value
        }
}