fun main() {
    val car1 = Cars("  Tesla ", "S Plaid", "White", 2)


    println("Name = ${car1.name}")
    println("Model = ${car1.model}")
    println("Color = ${car1.color}")
    println("Doors = ${car1.doors}")

    car1.move()
    car1.stop()

    println("\n")

    val car2 = Cars("Dodge", "Monster", "White", 2)

    println("Name = ${car2.name}")
    println("Model = ${car2.model}")
    println("Color = ${car2.color}")
    println("Doors = ${car2.doors}")

    car2.move()
    car2.stop()

}

class Cars( name: String, var model: String, var color: String, var doors: Int) {
    var name = name.trim()

    fun move(){
        println("The car $name is moving")
    }

    fun stop(){
        println("The car $name is stop")
    }

}