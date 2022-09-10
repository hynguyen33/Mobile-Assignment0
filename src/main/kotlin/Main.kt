import java.util.Scanner

// This assigment rrquired working on the interface and abstract.
// Creating Dimentionable as a contract for shape class.
// Creating child class named: square, triangle, circle, and equilateraltriangle
// equilateraltriangle will extend to triangle, and square, triangle, circle will extend to shape.
// Users will input dimention for each shape and then return the area.
fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    val Cir:Shape = Circle("Circle")
    println("Enter Dimention for Circle: ")
    println("Enter Radius: ")
    var circle:Double =reader.nextDouble()

    (Cir as Circle).setDimenstion(circle);

    val Squa:Shape = Square("Square")
    println("Enter Dimention for Square: ")
    println("Enter Length: ")
    val lenght: Double = reader.nextDouble()
    println("Enter height: ")
    val height:Double =reader.nextDouble()
    (Squa as Square).setDimensions(lenght,height)

    val Tri:Shape =  Triangle("Triangle")
    println("Enter Dimention for Triangle")
    println("Enter side 1: ")
    val side1 = reader.nextDouble()
    println("Enter side 2: ")
    val side2 = reader.nextDouble()
    println("Enter side 3: ")
    val side3 = reader.nextDouble()
    println("")
    (Tri as Triangle).setDimenstion(side1,side2,side3)
    val Equi:Shape = EquilateralTriangle("EquilateralTriangle")
    println("Enter Dimention for EquilateralTriangle: ")
    println("enter side: ")
    val side =reader.nextDouble()
    (Equi as EquilateralTriangle).setDimention(side)
    println("Result: ")
    Squa.printDimentsion()
    println("")
    Tri.printDimentsion()
    println("")
    Cir.printDimentsion()
    println("")
    Equi.printDimentsion()
}
