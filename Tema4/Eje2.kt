fun main() {
    val button = "A"

    println(
        when (button) {
            "A" -> "Sí"
            "B" -> "No"
            "X" -> "Menú"
            "Y" -> "Nada"
            else -> "No existe tal botón."
        }
    )
}
