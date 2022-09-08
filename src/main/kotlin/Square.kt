import Shape

class Square(height: Int, length: Int,_name: String): Shape(_name) {
    fun setDimensions() {
        println("Enter Length: ")
        val lenght = readLine()
        println("Enter height: ")
        val height = readLine()
    }
}