class Solution {
fun areOccurrencesEqual(s: String): Boolean {
    // <Karakter, Jumlah>
    val map = mutableMapOf<Char, Int>()

    for (c in s) {
        if (map.containsKey(c)) {
            map[c] = map[c]!! + 1
        } else map[c] = 1
    }

    var num: Int? = null
    for ((_, v) in map) {
        if (num == null) num = v
        if (num != v) return false
    }

    return true
}
}