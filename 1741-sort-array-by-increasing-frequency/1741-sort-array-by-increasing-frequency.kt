class Solution {
    fun frequencySort(nums: IntArray): IntArray {
    val count = counter(nums.iterator())
    val sorted = count.toList().sortedWith(
        Comparator { o1, o2 ->
            if (o1.second == o2.second) o2.first - o1.first
            else o1.second.compareTo(o2.second)
        }
    )
    return arrayListOf<Int>().apply {
        for ((k, _) in sorted) {
            for (num in nums) if (num == k) add(k)
        }
    }.toIntArray()
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