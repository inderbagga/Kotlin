fun main(){

    val sum=Maths.sum(12,243)
    val sub=Maths.sub(12,243)

    println("The value of sum is $sum.")
    println("The value of sub is $sub.")

}

class Maths{

    companion object{

        fun sum(num1:Int,num2:Int)=num1.plus(num2)
        fun sub(num1:Int,num2:Int)=if(num1>num2)num1.minus(num2)else num2.minus(num1)
    }

}