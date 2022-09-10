import Shape

open class Square(_name: String):Shape(_name) {
    var height: Double = 0.0
    var lenght: Double = 0.0
    fun setDimensions(h: Double,l:Double) {
        height = h
        lenght = l
    }

    override fun getArea(): Double {
        var result = height*lenght
        return result
    }
    override fun printDimentsion() {
        println("Shape: " + name)
        println("Dimention:" + "height: " + height +", length: " + lenght)
        println("Area: "+ getArea())
    }
}