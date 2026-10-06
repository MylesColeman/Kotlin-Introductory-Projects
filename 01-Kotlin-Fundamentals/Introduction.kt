import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    //printTest()
    //assignValuesTest()
    //calculateTest()
    //stringModTest()
    //sizeComparisonTest()
    /*palindromeTest("tacocat")
    palindromeTest("String")*/
    //println(sphereVolumeCalc(5f))
    //arrayTest()
    //printLoop(5)
    //printNumOneToFourtyTwo()
    //printAToZ()
    //println(arraySum())
    //populatingListWithReverseArray()
    /*whenAgeTest(6)
    whenAgeTest(15)
    whenAgeTest(18)
    whenAgeTest(20)
    whenAgeTest(30)
    whenAgeTest(80)*/
    //println(powerCalculator(5f, 3f))
    val primeTest = 3
    if (primeTest.isPrime()) println("Is Prime")
    
}

fun printTest(){
    println("Hello, world!!!")
}

fun assignValuesTest(){
    var valOne = 1
    //val valTwo = 10
    println(valOne)
    //println(valTwo)
    valOne = 2
    //valTwo = 20
    println(valOne)
    //println(valTwo)
}

fun calculateTest(){
    val intOne = 1
    val intTwo = 5
    
    println(intOne + intTwo) // Addition
    println(intOne - intTwo) // Subtraction
    println(intOne * intTwo) // Multiplication
    println(intOne / intTwo) // Division
    
    println(intOne % intTwo) // Modulus
}

fun stringModTest(){
    val string = "String"
    
    println(string.uppercase())
    println(string.reversed())
}

fun sizeComparisonTest(){
    val intOne = 1
    val intTwo = 2
    val intThree = 3
    val intFour = 4
    
    if (intOne != intTwo || intThree == intFour && intThree > intTwo){
        println("True!")
    }

}

fun palindromeTest(stringOne: String){
	if (stringOne == stringOne.reversed()){
        println("String is a palindrome.")
    }
   	else{
        println("String is NOT a palindrome.")
    }
}

fun sphereVolumeCalc(radius: Float): Double{
    return (4f / 3f) * PI * radius.toDouble().pow(3.0)
}

fun arrayTest(){
    val intArray = arrayOf(1, 2, 3)
    val stringArray = arrayOf("this", "is", "an", "array")
    
    println(intArray.joinToString())
    println(stringArray.joinToString())
}

fun printLoop(n: Int){
    var counter = 0
    
    while (counter < n){
        println("A String")
        counter++
    }
}

fun printNumOneToFourtyTwo(){
    for (i in 1..42){
        println(i)
    }
}

fun printAToZ(){
    for (letter in 'a'..'z'){
        println(letter)
    }
}

fun arraySum(): Int{
    val testArray = arrayOf(1, 2, 3, 4, 5)
    var runningSum = 0
    
    for (i in testArray){
        runningSum += i
    }
    
    return runningSum
}

fun populatingListWithReverseArray(){
    val testList = mutableListOf<Int>()
    val testArray = arrayOf(1, 2, 3, 4, 5)
    
    for (i in testArray.indices.reversed()){
        testList.add(testArray[i])
    }
    
    println(testList.joinToString())
}

fun whenAgeTest(age: Int){
    when{
        age < 13 -> println("Young Kid")
        age in 13..17 -> println("Teenager")
        age == 18 -> println("18 Year Old")
        age < 21 -> println("Young Adult")
        age in 21..59 -> println("Adult")
        age >= 60 -> println("Elder")
    }
}

fun powerCalculator(base: Float, exponent: Float): Float{
    return base.pow(exponent)
}

fun Int.isPrime(): Boolean{
    if (this <= 1) return false // 1 isn't prime
    
    // Only check to square root for efficiency
    val sqrtVal = sqrt(this.toDouble())
    for (i in 2..sqrtVal.toInt()){
        if (this % i == 0){
            return false
        }
    }
    
    return true
}
