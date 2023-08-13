fun main(args: Array<String>) {
    val geo1 = Geometry<Square>()
    geo1.getMessage(Square(), 5)

    val geo2 = Geometry<Circle>()
    geo2.getMessage(Circle(), 8)
}

abstract class Shape {
    abstract fun area(size: Int): Double
}

class Square: Shape() {
    override fun area(size: Int) = (size * size).toDouble()
}

class Circle: Shape() {
    override fun area(size: Int) = size * size * 3.1415
}

class Geometry<T: Shape> {
    fun getMessage(shape: T, size: Int) {
        println("The area of this shape is ${shape.area(size)}")
    }
}