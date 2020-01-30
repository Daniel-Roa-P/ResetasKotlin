
class Cereal() : Alimento() {

    override fun mostrarMenu(): String?  {

        elementos=7

        alimentos = listOf("Maiz","Trigo","Arroz","Cebada","Avena","Alpiste","Salir")

        println("Seleccione el ingrediente")
        for (i in 1..elementos) {

            println("   $i. ${alimentos.get(i-1)}")

        }

        opcion = readLine()

        if(opcion=="7"){

            return ""

        } else {

            return alimentos.get(opcion.toString().toInt() - 1)

        }

    }

}