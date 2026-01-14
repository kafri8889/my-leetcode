class Solution {
fun mirrorDistance(n: Int): Int {
    return abs(n - reverseInt(n))
}

fun reverseInt(x: Int): Int {
    var n = x
    var reversed = 0

    while (n > 0) {
        val temp = n % 10
        n /= 10
        reversed = reversed * 10 + temp
    }

    return reversed
}
}