fun main(args: Array<String>) {
    val NotaEstudiante = 65

    if(NotaEstudiante >=90)
        println("Sobresaliente")
    else if (NotaEstudiante >=80)
        println("Destacado")
    else if (NotaEstudiante >=70)
        println("Satisfactorio")
    else if (NotaEstudiante >=60)
        println("Aprobado")
    else
        println("Necesita mejorar")
}