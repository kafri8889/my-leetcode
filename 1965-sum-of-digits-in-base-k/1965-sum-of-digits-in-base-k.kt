class Solution {
fun sumBase(n: Int, k: Int): Int {
    var sum = 0
    var mn = n
    while (mn > 0) {
        sum += mn % k
        mn /= k
    }
    return sum
}
}