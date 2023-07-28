class Solution {
    fun largestOddNumber(num: String): String {
    for (i in num.indices) {
        val str = num.substring(0, num.length - i)
        if (str.isNotBlank() && str[str.lastIndex].toInt() % 2 != 0) return str
    }
        return ""
    }
}