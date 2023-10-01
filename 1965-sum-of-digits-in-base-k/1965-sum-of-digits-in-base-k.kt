class Solution {
fun sumBase(n: Int, k: Int): Int {
    return arrayListOf<Int>().apply {
        var mn = n
        while (mn > 0) {
            add(if (size == 0) 0 else lastIndex, mn % k)
            mn /= k
        }
    }.sum()
}
}