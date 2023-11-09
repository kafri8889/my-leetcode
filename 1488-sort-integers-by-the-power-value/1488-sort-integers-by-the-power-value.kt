class Solution {
fun getKth(lo: Int, hi: Int, k: Int): Int {
    return Array(hi - lo + 1) { 1 to 1 }.apply {
        for ((i, num) in (lo..hi).withIndex()) {
            var x = num
            while (x != 1) {
                if (x % 2 == 0) x /= 2 else x = 3 * x + 1
                set(i, num to get(i).second + 1)
            }
        }
    }.sortedBy { it.second }[k - 1].first
}
}