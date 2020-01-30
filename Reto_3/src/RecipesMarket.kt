
fun main(){

    val menu = """
    Seleccione la opción deseada:
        1. Hacer una receta
        2. Ver mis recetas
        3. Salir""".trimMargin()

    var opcionUsuario: String? = "0"
    val recetas : MutableList<MutableList<String?>> = mutableListOf()

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

fun elegirIngrediente () : MutableList<String?> {

    val ingredientes: List<String> = listOf("Agua","Leche","Carne","Verduras","Frutas","Cereal","Huevos","Aceite", "Volver al menu")
    val listaDeIngredientes : MutableList <String?> = mutableListOf()
    var opcionIngrediente :String? = "0"
    var opcionAlimento :String? = "0"
    var alimento: Alimento? = null
    var alimentoSeleccionado: String? = ""

    while (true) {

        println("Seleccione el ingrediente")
        for (i in 1..9) {

            println("   $i. ${ingredientes.get(i-1)}")

        }

        opcionIngrediente = readLine()

        when(opcionIngrediente){

            "1" -> alimento = Agua()
            "2" -> alimento = Leche()
            "3" -> alimento = Carne()
            "4" -> alimento = Verduras()
            "5" -> alimento = Frutas()
            "6" -> alimento = Cereal()
            "7" -> alimento = Huevos()
            "8" -> alimento = Aceite()
            "9" -> alimento = null

        }

        if(alimento != null){

            while (true){

                alimentoSeleccionado = alimento.mostrarMenu()

                if(alimentoSeleccionado.equals("")){

                    break

                } else{

                    listaDeIngredientes.add(alimentoSeleccionado)

                }

            }

        } else {

            break

        }

    }

    return listaDeIngredientes

}

fun consultarRecetas(recetas: MutableList<MutableList<String?>>) {

    for(i in recetas){

        println(i)

    }

}