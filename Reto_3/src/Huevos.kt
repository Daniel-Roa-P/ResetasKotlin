
class Huevos() : Alimento() {

    override fun mostrarMenu(): String?  {

        elementos=3

        alimentos = listOf("Huevos de gallina","Huevos de coodornis","Salir")

        println("Seleccione el ingrediente")
        for (i in 1..elementos) {

            println("   $i. ${alimentos.get(i-1)}")

        }

        opcion = readLine()

        if(opcion=="3"){

            return ""

        } else {

            return alimentos.get(opcion.toString().toInt() - 1)

        }
    }

}