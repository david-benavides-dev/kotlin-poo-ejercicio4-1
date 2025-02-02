import classes.Rectangulo

fun main() {

    // * Instancia de la clase rectángulo con base 15 y altura 10.
    val rectangulo1 = Rectangulo(15.0, 10.0)

    println("\u001B[31m** INFORMACIÓN RECTÁNGULO1 **\u001B[0m\n$rectangulo1")
    println("Area >> ${rectangulo1.calcularArea()}")
    println("Perímetro >> ${rectangulo1.calcularPerimetro()}")
    println("")

    // * Instancia de la clase rectángulo con base 5 y altura 10.
    val rectangulo2 = Rectangulo(5.0, 10.0)

    println("\u001B[31m** INFORMACIÓN RECTÁNGULO2 **\u001B[0m\n$rectangulo2")
    println("Area >> ${rectangulo2.calcularArea()}")
    println("Perímetro >> ${rectangulo2.calcularPerimetro()}")
    println("")

    // * Instancia de la clase rectángulo con base 5 y altura 10.
    val rectangulo3 = Rectangulo(5.0, 10.0)

    println("\u001B[31m** INFORMACIÓN RECTÁNGULO3 **\u001B[0m\n$rectangulo3")
    println("Area >> ${rectangulo3.calcularArea()}")
    println("Perímetro >> ${rectangulo3.calcularPerimetro()}")

    // * Intento de crear un rectángulo con base negativa y altura 5 para que salte excepción.
    try {
        val rectangulo4 = Rectangulo(-1.0,5.0)
        println("\u001B[31m** INFORMACIÓN RECTÁNGULO4 **\u001B[0m\n$rectangulo4")
        println("Area >> ${rectangulo4.calcularArea()}")
        println("Perímetro >> ${rectangulo4.calcularPerimetro()}")
    } catch (e: IllegalArgumentException) {
        println("ERROR>> ${e.message}")
    }
}