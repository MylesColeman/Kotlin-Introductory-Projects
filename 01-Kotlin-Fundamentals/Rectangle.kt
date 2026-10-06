fun main() {
    val rect = Rectangle()
    println(rect.calcArea())
    println(rect.calcPerimeter())
    if (!rect.isSquare()) println("Rect is not square.")
}

class Rectangle(){
    var width = 0.0
    var height = 0.0
    
    init{
        width = 10.0
        height = 20.0
    }
    
    fun calcArea() = width * height
    fun calcPerimeter() = (width * 2) + (height * 2)
    fun isSquare() = width == height
}
