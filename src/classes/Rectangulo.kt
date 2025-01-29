package classes

/**
 * Representa un rectángulo definido por su base y altura.
 *
 * @property base La base del rectángulo. Debe ser mayor que 0.
 * @property altura La altura del rectángulo. Debe ser mayor que 0.
 */
class Rectangulo (private val base: Double, private val altura: Double) {

    init {
        require(validarBaseAltura(base, altura)) { "La base tiene que ser mayor que 0." }
    }

    /**
     * Valida que la base y la altura sean mayores que 0.
     *
     * @param base La longitud de la base.
     * @param altura La longitud de la altura.
     * @return `true` si ambos son mayores que 0, `false` en caso contrario.
     */
    private fun validarBaseAltura(base: Double, altura: Double): Boolean {
        return base > 0 && altura > 0
    }

    /**
     * Calcula el área del rectángulo.
     *
     * @return El área del rectángulo.
     */
    fun calcularArea(): Double {
        return base * altura
    }

    /**
     * Calcula el perímetro del rectángulo.
     *
     * @return El perímetro del rectángulo.
     */
    fun calcularPerimetro(): Double {
        return 2 * (base * altura)
    }

    /**
     * Devuelve una representación en cadena del rectángulo.
     */
    override fun toString(): String {
        return "Base: $base y Altura: $altura"
    }
}