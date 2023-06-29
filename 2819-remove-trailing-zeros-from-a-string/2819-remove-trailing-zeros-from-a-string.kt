class Solution {
    fun removeTrailingZeros(num: String): String {
        var s = num
    while (s.endsWith("0")) s = s.slice(0 until s.length - 1)
    return s
    }
}