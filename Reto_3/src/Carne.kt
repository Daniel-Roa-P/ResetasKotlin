
class Carne() : Alimento() {

    override fun mostrarMenu(): String? {

        menu = """
        Seleccione el tipo de carne deseada:
            
            1. Carne de res
            2. Carne de pollo
            3. Carne de cerdo
            4. Pescado
            5. Salir""".trimMargin()

        return menu

    }

}