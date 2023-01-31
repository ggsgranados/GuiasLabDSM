fun main(args: Array<String>) {
    var characterVariable01 = 'a'
    var characterVariable02 = '\u0061'
    val stringVariable: String = characterVariable01.toString()

    println(characterVariable01)
    println(characterVariable02)

    println(characterVariable01.isLowerCase())
    println(characterVariable01.isDigit())
    println(characterVariable01.uppercaseChar())
}