//functions
//User defined functions
//How to create a function and call it
//function with arguments and a return value
fun main(){
    println(callMe("Victorine Amani"))
    val construct=Construct()
    construct createPyramid 5
    val  another=Another()
    another student 18
    def('a',1)
    defaut('m')
    display(numbre=3)
}

fun callMe(name:String):String{
    return "Hello ${name}"
}

//infix function call
//used to call a function without using the period or parenthesis making it look like a natural language
//But can only be used on functions with a single parameter

class Construct(){
    infix fun createPyramid(rows: Int){
        var k=0
        for (i in 1..rows){
            k=0
            for(space in 1..rows-i){
                print(" ")
            }
            while (k !=2*i-1){
                print(" *")
                ++k
            }
            println()
        }
    }
}
class Another(){
    infix fun student(age:Int){
        if(age>=18 && age<=24){
            println("Welcome ${age} year old student to AkiraChix")
        }else{
            println("You're not fit for this school")
        }
    }

}

//Default and Named arguments
//Default arguments
fun def(letter:Char='V',numb:Int=10){
    println("${letter} is in the word Victoria ${numb} time")
}//prints out a and 2 and ignores the default values


fun defaut(letter:Char='b',numb:Int=5){
    println(letter)
    println(numb)
} //prints out 'm' nd 5

//named arguments
fun display(border:Char='=',numbre:Int=19){
    for (i in 1..numbre){
        print(border)
    }

}

//Recursion and tail recursion
//recursion




