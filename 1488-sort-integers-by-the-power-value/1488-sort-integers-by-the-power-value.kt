class Solution {
fun getKth(lo: Int, hi: Int, k: Int): Int {
    
    val map = arrayListOf<Pair<Int, Int>>().apply {
        for (i in lo..hi) {
            var x = i
            var step = 0
            while (x != 1) {
                if (x % 2 == 0) x /= 2 else x = 3 * x + 1
                step++
            }

            add(i to step)
        }
    }

    return map.sortedBy { it.second }.also { println(it) }[k - 1].first
}
}