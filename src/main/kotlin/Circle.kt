open class Circle(_name: String):Shape(_name) {

    var radius : Double = 0.0
    fun setDimenstion(r: Double) {

        radius = r
    }
    override fun getArea(): Double{
        val result: Double
        result =  radius*radius*3.14
        return result
    }

    override fun printDimentsion() {
        println("Shape: " + name)
        println("Dimention:" + "Radius: " + radius)
        println("Area: "+ getArea())
    }

}