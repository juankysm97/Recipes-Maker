
val listaIngredientes:List<String> = listOf<String>(
    "Agua","Leche","Carne","Verduras","Frutas","Cereal","Huevos","Aceite")

val ingredientesSeleccionados:ArrayList<String> = ArrayList()

fun main(args:Array<String>){

    menuInicio()

}

fun menuInicio(){

        println(
            """::Bienvenidos a Recipe Marker::
        | Selecciona la opción deseada:
        | 1.Hacer una receta.
        | 2.Ver mis recetas.
        | 3.Salir.""".trimMargin()
        )

        println("Seleccione una opción:")
        val respuesta: String? = readLine()

        when (respuesta) {
            "1" -> hacerUnaReceta()
            "2" -> mostrarRecetas()
            "3" -> salirPrograma()
            else -> println("Ha ingresado una opcion incorrecta.Por favor, intente de nuevo.")
        }

}


fun salirPrograma(){
    println("Hasta pronto!")
}

fun mostrarRecetas(){

    if(ingredientesSeleccionados.size>0) {

        println("Mostrando ingredientes seleccionados:")

        for (i in ingredientesSeleccionados)
            println(i)
        /*
        ingredientesSeleccionados.forEach {
            println({ it })
        }

         */
    }else{
        println("No se a agregado ingredientes\n ")

    }

    println("0. Para regresar al menú anterior\n ")
    var tecla: String? = readLine()

    if(tecla.equals("0")) menuInicio()
}

fun hacerUnaReceta(){
    println("""
                Seleccione ingredientes:
                
                0. Menú inicial
                1. Agua
                2. Leche
                3. Carne
                4. Verduras
                5. Frutas
                6. Cereal
                7. Huevos
                8. Aceite
            """.trimIndent()
    )

    val seleccion:String? = readLine()


    when(seleccion){
        "0" -> {
            menuInicio()
        }
        "1" -> {
            ingredientesSeleccionados.add(listaIngredientes[0])
            print("agregando Agua\n")
            hacerUnaReceta()
        }
        "2" -> {
            ingredientesSeleccionados.add(listaIngredientes[1])
            print("agregando Leche\n")
            hacerUnaReceta()
        }
        "3" -> {
            ingredientesSeleccionados.add(listaIngredientes[2])
            print("agregando Carne\n")
            hacerUnaReceta()
        }
        "4" -> {
            ingredientesSeleccionados.add(listaIngredientes[3])
            print("agregando Verduras\n")
            hacerUnaReceta()
        }
        "5" -> {
            ingredientesSeleccionados.add(listaIngredientes[4])
            print("agregando Frutas\n")
            hacerUnaReceta()
        }
        "6" -> {
            ingredientesSeleccionados.add(listaIngredientes[5])
            print("agregando Cereal\n")
            hacerUnaReceta()
        }
        "7" -> {
            ingredientesSeleccionados.add(listaIngredientes[6])
            print("agregando Huevos\n")
            hacerUnaReceta()
        }
        "8" -> {
            ingredientesSeleccionados.add(listaIngredientes[7])
            print("agregando Aceite\n")
            hacerUnaReceta()
        }
    }
}



