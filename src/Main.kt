import classes.Rectangulo

fun main() {

    val rectangulo = Rectangulo(0,10)

    println("El rectángulo con base y altura ${rectangulo.consultarBaseAltura()}")
    println("Tiene un área de ${rectangulo.calcularArea()} y un perímetro de ${rectangulo.calcularPerimetro()}.")

}