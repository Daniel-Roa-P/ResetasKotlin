
class Carne() : Alimento() {

    override fun mostrarMenu(): String? {

        elementos=5

        alimentos = listOf("Carne de res","Carne de pollo","Carne de cerdo","Carne de pescado","Salir")

        println("Seleccione el ingrediente")
        for (i in 1..elementos) {

            println("   $i. ${alimentos.get(i-1)}")

        }

        opcion = readLine()

        if(opcion=="5"){

            return ""

        } else {

            return alimentos.get(opcion.toString().toInt() - 1)

        }

    }

}