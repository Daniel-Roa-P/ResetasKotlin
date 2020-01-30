
class Verduras() : Alimento() {

    override fun mostrarMenu(): String?  {

        elementos=6

        alimentos = listOf("Tomate","Cebolla","Brocoli","Zanahoria","Ajo","Salir")

        println("Seleccione el ingrediente")
        for (i in 1..elementos) {

            println("   $i. ${alimentos.get(i-1)}")

        }

        opcion = readLine()

        if(opcion=="6"){

            return ""

        } else {

            return alimentos.get(opcion.toString().toInt() - 1)

        }

    }

}