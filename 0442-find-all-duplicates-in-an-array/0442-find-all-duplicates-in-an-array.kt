class Solution {
    fun findDuplicates(nums: IntArray): List<Int> {
    val count = counter(nums.iterator())
    val twice = arrayListOf<Int>()
    for ((k, v) in count) if (v >= 2) twice.add(k)
    return twice
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