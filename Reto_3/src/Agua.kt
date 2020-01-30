
class Agua() : Alimento() {

    override fun mostrarMenu(): String? {

        elementos=5
        alimentos = listOf("Agua sin gas","Agua con gas","Agua mineral","Agua saborisada","Salir")

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
