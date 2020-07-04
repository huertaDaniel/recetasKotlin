fun main() {

  var opcion:String = """Bienvenido a Recipe Maker!:)
    Selecciona la opcion que quieras
    1 Hacer receta
    2 Ver receta
    3 Salir""".trimIndent()

    println(opcion)
    val response:String? = readLine()?:"3"

    when(response){
        "1" -> println("Hacer receta")
        "2" -> println("Ver mis recetas")
        "3" -> println("Gracias por su visita, vuelva pronto")

    }
}