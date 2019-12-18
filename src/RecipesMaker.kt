
fun main(){

    val menu = """
    Seleccione la opción deseada:
        1. Hacer una receta
        2. Ver mis recetas
        3. Salir""".trimMargin()

    var opcionUsuario: String? = "0"
    val recetas : MutableList<MutableList<String>> = mutableListOf()

    do {

        println("\n $menu")
        opcionUsuario = readLine()

        when(opcionUsuario){

            "1" -> recetas.add(elegirIngrediente())
            "2" -> consultarRecetas(recetas)
            "3" -> println("Hasta la proxima")
        }

    } while (opcionUsuario != "3")

}

fun elegirIngrediente () : MutableList<String> {

    val ingredientes: List<String> = listOf("Agua","Leche","Carne","Verduras","Frutas","Cereal","Huevos","Aceite", "Volver al menu")
    val listaDeIngredientes : MutableList <String> = mutableListOf()
    var opcionIngrediente :String? = "0"

    while (true) {

        println("Seleccione el ingrediente")
        for (i in 1..9) {

            println("   $i. ${ingredientes.get(i-1)}")

        }

        opcionIngrediente = readLine()

        if(opcionIngrediente != "9") {

            listaDeIngredientes.add(ingredientes.get(opcionIngrediente.toString().toInt() - 1))

        } else {

            break

        }

    }

    return listaDeIngredientes

}

fun consultarRecetas(recetas: MutableList<MutableList<String>>) {

    for(i in recetas){

        println(i)

    }

}

