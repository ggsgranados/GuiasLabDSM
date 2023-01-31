fun main(args: Array<String>) {
    val numero = 5
    val factorial = factorial(numero)
    println("El factorial de $numero es: $factorial")
}

fun factorial (numero: Int): Long {
    if(numero >=1)
        return numero * factorial(numero - 1)
    else
        return 1
}