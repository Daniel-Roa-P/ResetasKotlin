
abstract class Alimento (){

    protected var alimentos: List<String> = listOf("")
    protected var elementos: Int = 0
    protected var opcion: String? = ""

    abstract open fun mostrarMenu(): String?
    open fun getOpciones(): Int? {

        return elementos

    }
}