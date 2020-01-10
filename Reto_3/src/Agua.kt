
class Agua() : Alimento() {

    override fun mostrarMenu(): String? {

        menu = """
        Seleccione el tipo de agua deseada:
            
            1. Agua sin gas
            2. Agua con gas
            3. Agua mineral
            4. Agua saborisada
            5. Salir""".trimMargin()

        return menu

    }

}
