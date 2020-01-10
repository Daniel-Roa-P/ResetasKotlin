
class Verduras() : Alimento() {

    override fun mostrarMenu(): String? {

        menu = """
        Seleccione el tipo de verdura deseada:
            
            1. Tomate
            2. Cebolla
            3. Borcoli
            4. Zanahoria
            5. Ajo
            6. Salir""".trimMargin()

        return menu

    }

}