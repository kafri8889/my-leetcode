class Solution {
fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

fun gcdOfStrings(str1: String, str2: String): String {
    return if (str1 + str2 == str2 + str1) str1.substring(0, gcd(str1.length, str2.length)) else ""
}
}