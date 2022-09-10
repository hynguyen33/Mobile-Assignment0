import kotlin.math.sqrt

class EquilateralTriangle(_name: String):Triangle(_name = String()) {
    var side: Double = 0.0
    override fun setDimention(a: Double){
        side = a
    }
    override fun getArea(): Double {
        var result = (sqrt(3.0)/4.0)*side
        return result
    }
    override fun printDimentsion() {
        println("Shape: " + name)
        println("Dimention: " + "Side : " + side)
        println()
        println("Area: "+ getArea())
    }

}