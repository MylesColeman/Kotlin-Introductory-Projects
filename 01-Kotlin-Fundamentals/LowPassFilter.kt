private val alpha = 0.05f

fun lowPass(output: FloatArray, input: FloatArray): FloatArray {
    for (i in 0..2) {
        output[i] = output[i] + alpha * (input[i] - output[i])
    }
    return output
}
