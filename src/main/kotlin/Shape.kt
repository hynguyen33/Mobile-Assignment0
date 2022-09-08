import java.util.DoubleSummaryStatistics

abstract class Shape(_name : String): Dimentionable {
    var name = _name
    fun getArea(): Double {
        return 0.0;
    }
}