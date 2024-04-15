import kotlin.math.ln
import kotlin.random.Random

data class customer(val custNum: Int, var arrivalTime: Double, var serviceTimeRemaining: Double)
data class server(var currentlyServing: customer?) 

fun generateExponential(lambda: Double): Double {
    val random = Random.nextDouble(0.0, 1.0)
    return -ln(random) / lambda
}