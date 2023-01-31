fun main(args: Array<String>) {
    
    for (i in 0..10) {
        println(i)
    }
    println("-------------------------------------------------------------")
    for (i: Int in 0..10) {
        println(i)
    }
    println("-------------------------------------------------------------")
    if(5 in 1..10) println("5 fue encontrado en el rango")
    println("-------------------------------------------------------------")
    for (i in 1 until 5) {
        println(i)
    }
    println("-------------------------------------------------------------")
    for (i in 5 downTo 1) {
        println(i)
    }
    println("-------------------------------------------------------------")
    fun forIterate(){
        val array = arrayOf(1,2,3)
        for (i in array) {
            println(i)
        }
    }
    println("-------------------------------------------------------------")
    var i = 0
    while (i<10){
        println("El valor de i es: $i")
        i+=1
    }
    println("-------------------------------------------------------------")
    do{
        println("Esta linea solo sera impresa una vez")
    }while(false)
}