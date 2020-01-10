
class Aceite() : Alimento(){

    override fun mostrarMenu(): String? {

        menu="""
        Seleccione el tipo de aceite deseada:
            
            1. Aceite de oliva
            2. Aceite de girasol
            3. Aceite de soya
            4. aceite de canola
            5. Salir""".trimMargin()

        return menu

    }


}