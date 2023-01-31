fun main(args: Array<String>) {
    var varnumero: Int = 3
    var varany: Any = "DSM104"
    var a: Int = 50
    var b: Int = 75

    when(varnumero){
        1 -> println("varnumero tiene el valor: 1")
        2,3,4,5 -> println("Varnumero esta en el rango de 2 a 5")
        else -> "varnumero tiene un valor mayor de 5"
    }

    when(varany){
        is Int -> println("varany es de tipo Int")
        is Double -> println("varany es de tipo Int Double")
        is String -> println("varany es de tipo String")
        is Long -> println("varany es de tipo Long")
    }
    when{
        a * b > 100 -> println("El producto de a y b es mayor que 100")
        a + b > 100 -> println("La suma de a y b es mayor que 100")
        a < b -> println("a es menor que b")
    }
}