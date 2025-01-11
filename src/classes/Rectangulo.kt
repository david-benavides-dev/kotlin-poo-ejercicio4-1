package classes

class Rectangulo (val base: Int, val altura: Int) {

    init {
        try {
            require(base > 0) { "Base tiene que ser mayor que 0" }
            require(altura > 0) { "Altura tiene que ser mayor que 0" }
        } catch (e: IllegalArgumentException){
            println(e.message)
        }
    }


    fun consultarBaseAltura(): Pair<Int, Int>? {
        return if (altura != 0 && base != 0) {
            Pair(base, altura)
        } else {
            null
        }
    }


    fun calcularArea(): Int? {
        return if (altura != 0 && base != 0) {
            base * altura
        } else {
            null
        }
    }

    fun calcularPerimetro(): Int? {
        return if (altura != 0 && base != 0) {
            (2 * (base * altura))
        } else {
            null
        }
    }

}