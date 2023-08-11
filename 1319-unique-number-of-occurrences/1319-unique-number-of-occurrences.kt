class Solution {
fun uniqueOccurrences(arr: IntArray): Boolean {
    val map = hashMapOf<Int, Int>()
    val set = hashSetOf<Int>()
    for (n in arr) {
        map.putIfAbsent(n, 0)
        map[n] = map[n]!! + 1
    }
    for (v in map.values) {
        if (set.contains(v)) return false
        set.add(v)
    }
    return true
}
}