
class Cereal() : Alimento() {

    override fun mostrarMenu(): String? {

        menu = """
        Seleccione el tipo de cereal desead:
            
            1. Maiz
            2. Trigo
            3. Arros
            4. Cebada
            5. Avena
            6. Alpiste
            7. Salir""".trimMargin()

        return menu

    }

}