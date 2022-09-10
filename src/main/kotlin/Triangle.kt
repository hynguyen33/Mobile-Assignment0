import kotlin.math.sqrt

open class Triangle(_name: String):Shape(_name){
    var side1: Double = 0.0
    var side2: Double = 0.0
    var side3: Double = 0.0
    var p: Double = 0.0

    open fun setDimenstion(a: Double, b: Double, c: Double){
        side1 = a
        side2 = b
        side3 = c
        p = (side1 + side2 +side3)/2

    }
    override fun getArea(): Double {
        var result: Double
        result = sqrt(p*(p-side1)*(p-side2)*(p-side3))
        return result
    }
    override fun printDimentsion() {
        println("Shape: " + name)
        println("Dimention: " + "Side 1: " + side1 +", Side2: " + side2 +", Side 3: " + side3 )
        println()
        println("Area: "+ getArea())
    }

    open fun setDimention(a: Double) {}
}