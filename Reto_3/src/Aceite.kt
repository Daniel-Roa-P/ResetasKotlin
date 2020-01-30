
class Aceite() : Alimento(){

    override fun mostrarMenu(): String?{

        elementos=5

        alimentos = listOf("Aceite de oliva","Aceite de girasol","Aceite de soya","Aceite de canola","Salir")

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