class Solution {
    fun findMatrix(nums: IntArray): List<List<Int>> {
    val count = counter(nums.iterator())
    return arrayListOf<List<Int>>().apply {
        while (true) {
            val li = arrayListOf<Int>()
            for ((k, v) in count) {
                if (v != 0) li.add(k).also { count[k] = count[k]!! - 1 }
            }
            add(li)

            if (count.values.all { it == 0 }) break
        }
    }
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