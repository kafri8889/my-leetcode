class Solution {
fun uniqueOccurrences(arr: IntArray): Boolean {
    val map = hashMapOf<Int, Int>()
    val set = hashSetOf<Int>()
    for (n in arr) if (map.containsKey(n)) map[n] = map[n]!! + 1 else map[n] = 1
    for (v in map.values) if (set.contains(v)) return false else set.add(v)
    return true
}
}