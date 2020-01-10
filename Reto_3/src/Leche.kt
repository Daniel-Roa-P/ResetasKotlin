
    class Leche() : Alimento() {

    override fun mostrarMenu(): String? {

        menu = """
        Seleccione el tipo de leche deseada:
            
            1. Entera
            2. Deslactosada
            3. Descremada
            4. Salir""".trimMargin()

        return menu

    }

}