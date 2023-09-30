class Solution {
fun countSymmetricIntegers(low: Int, high: Int): Int {
    var count = 0
    for (i in low..high) {
        if (intLength(i) % 2 != 0) continue
        val s = i.toString()
        val firstHalf = s.substring(0 until s.length / 2).sumOf { it.digitToInt() }
        val lastHalf = s.substring(s.length / 2 until s.length).sumOf { it.digitToInt() }
        if (firstHalf == lastHalf) count++
    }
    return count
}

/**
 * Get length from integer without cast to string
 */
fun intLength(num: Int): Int {
    return log10(abs(num).toDouble()).toInt() + 1
}
}