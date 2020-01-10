
class Frutas() : Alimento() {

    override fun mostrarMenu(): String? {

        menu = """
        Seleccione el tipo de fruta deseada:
            
            1. Manzana
            2. Pera
            3. Fresa
            4. Banana
            5. Limon
            6. Mango
            7. Durazno
            8. Melocoton
            9. Salir""".trimMargin()

        return menu

    }

}