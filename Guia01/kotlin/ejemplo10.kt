fun main(args: Array<String>) {
    mostrarSaludo("Hola estudiantes DSM104",5)
}
fun mostrarSaludo(mensaje: String, conteo: Int): Unit {
    var contador = 1
    while(contador++ <= conteo){
        println(mensaje)
    }
}