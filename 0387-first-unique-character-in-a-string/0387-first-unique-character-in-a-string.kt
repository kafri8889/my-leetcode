class Solution {
fun firstUniqChar(s: String): Int {
    val map = counter(s.iterator())
    for (i in s.indices) if (map.getOrDefault(s[i], -1) == 1) return i

    return -1
}

fun <T> counter(iter: Iterator<T>): HashMap<T, Int> {
    return hashMapOf<T, Int>().apply {
        for (t in iter) set(t, if (t in keys) get(t)!! + 1 else 1)
    }
}
}