class Solution {
    fun singleNumber(nums: IntArray): Int {
        val count = counter(nums.iterator())
    return count.minBy { it.value }!!.key
    }

    fun <T> counter(iter: Iterator<T>): MutableMap<T, Int> {
    return mutableMapOf<T, Int>().apply {
        for (t in iter) {
            if (t in keys) set(t, get(t)!! + 1)
            else set(t, 1)
        }
    }
}
}