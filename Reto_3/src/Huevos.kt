
class Huevos() : Alimento() {

    override fun mostrarMenu(): String? {

        menu = """
        Seleccione el tipo de huevos deseados:
            
            1. Huevos de gallina
            2. Huevos de codornis
            3. Salir""".trimMargin()

        return menu

    }

}