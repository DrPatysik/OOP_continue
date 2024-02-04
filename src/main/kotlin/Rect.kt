open class Rect( var length:Int, var width:Int) {
    constructor():this(0 , 0)

    fun createRect(length: Int, width: Int){
        println("Rectangle length is $length and width is $width ")
    }
    fun perimeterRect():Int {
        val perimeter = ( this.length + this.width ) * 2
        return perimeter
    }
    fun squareRect():Int {
        val square = this.length * this.width
        return square
    }
}