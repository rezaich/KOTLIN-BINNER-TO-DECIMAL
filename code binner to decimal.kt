import kotlin.math.pow

fun main() {
    var bin = "101"
    var dec = 0

    var lastIndex = bin.lastIndex
    for (i in 0..lastIndex){
        dec += 2.0.pow(i.toDouble()).toInt()* bin[lastIndex-i].toString().toInt()
    }
    println(dec)
}
