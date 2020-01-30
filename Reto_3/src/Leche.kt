
    class Leche() : Alimento() {

    override fun mostrarMenu(): String?  {

        elementos=4

        alimentos = listOf("Leche entera","Leche deslactosada","Leche descremada","Salir")

        println("Seleccione el ingrediente")
        for (i in 1..elementos) {

            println("   $i. ${alimentos.get(i-1)}")

        }

        opcion = readLine()

        if(opcion=="4"){

            return ""

        } else {

            return alimentos.get(opcion.toString().toInt() - 1)

        }

    }

}