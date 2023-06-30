class Solution {
    fun numJewelsInStones(jewels: String, stones: String): Int {
    return counter(stones.iterator()).let {
        var count = 0
        for (jewel in jewels) {
            it[jewel].let { if (it != null) count += it }
        }
        count
    }
}

fun <T> counter(iter: Iterator<T>): Map<T, Int> {
    return mutableMapOf<T, Int>().apply {
        for (t in iter) {
            if (t in keys) set(t, get(t)!! + 1)
            else set(t, 1)
        }
    }
}
}