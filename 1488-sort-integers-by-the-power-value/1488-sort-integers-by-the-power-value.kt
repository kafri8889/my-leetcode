class Solution {
fun getKth(lo: Int, hi: Int, k: Int): Int {
    return arrayListOf<Pair<Int, Int>>().apply {
        for ((i, num) in (lo..hi).withIndex()) {
            add(num to 0)

            var x = num
            while (x != 1) {
                if (x % 2 == 0) x /= 2 else x = 3 * x + 1
                set(i, num to get(i).second + 1)
            }
        }
    }.sortedBy { it.second }[k - 1].first
}
}