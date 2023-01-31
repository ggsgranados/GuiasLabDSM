import java.util.*

class Nota(var nombre: String, var contenido:String, var fechaCreacion:Date) {
    
    init{
        nombre = nombre.toUpperCase()
    }

    constructor(nombre:String, contenido:String):this(nombre,contenido,Date())

    fun imprimirTotalCaracterContenido(){
        println(contenido.length)
    }

    fun contarPalabrasContenido() : Int {
        val palabras = contenido.split(" ")
        return palabras.size
    }

    fun contarPalabrasContenido(palabra:String):Int{
        val palabras = contenido.split(" ")
        var contador = 0
        palabras.forEach(){
            if(it.toUpperCase()==palabra.toUpperCase()) contador++
        }
        return contador
    }
}
fun main(args: Array<String>) {
    val nota1 = Nota("Kotlin","Kotlin es un lenguaje de programación orientada a objetos",Date())
    println(nota1.contarPalabrasContenido())
    println(nota1.contarPalabrasContenido("kotlin"))
    println(nota1.contenido)
}