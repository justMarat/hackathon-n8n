data class ClssUtil(val i: Double, val r: Double, val d: Double)

fun do_calc(a: ClssUtil): Double {
    val p = a.i
    val t = a.r
    val ds = a.d

    if (p <= 0.0) {
        return 0.0
    }

    val s1 = p - ds
    
    val tx_amnt = s1 * t
    
    val res = s1 + tx_amnt

    return res
}

fun main() {
    val x = ClssUtil(i = 100.0, r = 0.05, d = 10.0)
    val final_p = do_calc(x)
    println("Resulting Cost: $final_p")
}
