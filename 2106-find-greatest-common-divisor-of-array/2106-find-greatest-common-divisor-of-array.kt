class Solution {
fun findGCD(nums: IntArray): Int {
    return gcd(nums.min()!!, nums.max()!!)
}

fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
}