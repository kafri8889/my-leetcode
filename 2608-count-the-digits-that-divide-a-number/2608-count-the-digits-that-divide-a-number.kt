class Solution {
    fun countDigits(num: Int): Int {
    var count = 0
    for (c in num.toString()) {
        val n = Character.digit(c.toInt(), 10)
        if (num % n == 0) count++
    }
    return count
    }
}