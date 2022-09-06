import java.util.DoubleSummaryStatistics

abstract class Shape(_name : String): Dimentionable {
    var name = _name
    fun getArea(){
        return 0.0;
    }
    open fun setDimensions(_name: String){
        val input = _name
        val Square = "Square"
        val Circle = "Circle"
        val Triangle = "Triangle"

        if (input == Square){
            println("Enter Length: ")
            val lenght = readLine()
            println("Enter height: ")
            val height = readLine()

        }
        else if (input == Circle ){
            println("Enter side 1: ")
            val side1 = readLine()
            println("Enter side 2: ")

            val side2 = readLine()
            println("Enter side 3: ")
            val side3 = readLine()
        }
        else if(input == Triangle){
            println("Enter radius: ")
            val radius = readLine()
        }
    }
}