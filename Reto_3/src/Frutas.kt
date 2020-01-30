
class Frutas() : Alimento() {

    override fun mostrarMenu(): String?  {

        elementos=9

        alimentos = listOf("Manzana","Pera","Fresa","Banana","Limon","Mango","Durazno","Melocoton","Salir")

        println("Seleccione el ingrediente")
        for (i in 1..elementos) {

            println("   $i. ${alimentos.get(i-1)}")

        }

        opcion = readLine()

        if(opcion=="9"){

            return ""

        } else {

            return alimentos.get(opcion.toString().toInt() - 1)

        }

    }

}