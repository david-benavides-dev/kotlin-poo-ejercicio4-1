import classes.Rectangulo

fun main() {

    val rectangulo1 = Rectangulo(15.0, 10.0)

    println("\u001B[31m** INFORMACIÓN RECTÁNGULO1 **\u001B[0m\n$rectangulo1")
    println("Area >> ${rectangulo1.calcularArea()}")
    println("Perímetro >> ${rectangulo1.calcularPerimetro()}")
    println("")

    val rectangulo2 = Rectangulo(5.0, 10.0)

    println("\u001B[31m** INFORMACIÓN RECTÁNGULO2 **\u001B[0m\n$rectangulo2")
    println("Area >> ${rectangulo2.calcularArea()}")
    println("Perímetro >> ${rectangulo2.calcularPerimetro()}")
    println("")

    val rectangulo3 = Rectangulo(5.0, 10.0)

    println("\u001B[31m** INFORMACIÓN RECTÁNGULO3 **\u001B[0m\n$rectangulo3")
    println("Area >> ${rectangulo3.calcularArea()}")
    println("Perímetro >> ${rectangulo3.calcularPerimetro()}")

}