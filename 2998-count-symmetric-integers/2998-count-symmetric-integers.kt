class Solution {
fun countSymmetricIntegers(low: Int, high: Int): Int {
    return (low..high).fold(0) { acc, i ->
        if (intLength(i) % 2 == 0) {
            val s = i.toString()
            val firstHalf = s.substring(0 until s.length / 2).sumOf { it.digitToInt() }
            val lastHalf = s.substring(s.length / 2 until s.length).sumOf { it.digitToInt() }
            if (firstHalf == lastHalf) return@fold acc + 1
        }

        acc
    }
}

/**
 * Get length from integer without cast to string
 */
fun intLength(num: Int): Int {
    return log10(abs(num).toDouble()).toInt() + 1
}
}