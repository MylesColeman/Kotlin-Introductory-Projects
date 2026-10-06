fun main() {
    /*println(characterCaseFlipping('f'))
    println(characterCaseFlipping('R'))
    println(characterCaseFlipping('!'))*/
    
    val inputString = "InHuMaN"
    val outputString = stringCaseFlipping(inputString)
    
    println(outputString)
}

fun characterCaseFlipping(c: Char): Char{
    return when (c){
        in 'a'..'z' -> (c.code - 32).toChar()
        in 'A'..'Z' -> (c.code + 32).toChar()
        else -> c
    }
}

// Calls 'characterCaseFlipping' to flip the characters of a string
fun stringCaseFlipping(string: String): String{
    val flippedChars = string.map {char -> characterCaseFlipping(char)}
    
    return flippedChars.joinToString("") // Empty to ensure no gaps
}
