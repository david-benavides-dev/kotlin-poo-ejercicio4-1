package classes

class Rectangulo (val base: Double, val altura: Double) {

    init {
        try {
            require(base > 0) { "Base tiene que ser mayor que 0" }
            require(altura > 0) { "Altura tiene que ser mayor que 0" }
        } catch (e: IllegalArgumentException){
            println(e.message)
        }
    }


    fun calcularArea(): Double {
        return base * altura
    }


    fun calcularPerimetro(): Double {
        return 2 * (base * altura)
    }

    override fun toString(): String {
        return "Base: $base y Altura: $altura"
    }
}