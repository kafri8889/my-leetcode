class Solution {
 fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
    HashMap<Int, List<Int>>().apply {
        for ((i, n) in nums.withIndex()) if (containsKey(n)) set(n, get(n)!! + i) else put(n, listOf(i))
    }.forEach { (_, v) ->
        for (i in v.indices) {
            if (i + 1 > v.lastIndex) break
            if (abs(v[i] - v[i + 1]) <= k) return true
        }
    }

    return false
}
}