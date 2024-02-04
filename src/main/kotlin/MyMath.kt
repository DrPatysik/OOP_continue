class MyMath {
    companion object{
        fun sumLength( vararg lengths:Double){
            var sum = 0.0
            for(i in lengths) {
                sum += i
            }
            println("Sum of all length is $sum ")
        }
    }
}