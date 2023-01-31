fun main(args: Array<String>) {
    var x1 = 2F
    var y1 = 4F
    var c1 = -2F
    var x2 = -3F
    var y2 = 5F
    var c2 = 10F
    var x : Float = (c1*y2 - x2*y1) / (x1*y2 - x2*y1)
    var y : Float = (x1*c2 - x2*c1) / (x1*y2 - x2*y1)
    println("x = $x")
    println("y = $y")
}