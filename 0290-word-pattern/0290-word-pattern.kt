class Solution {
    fun wordPattern(pattern: String, s: String): Boolean {
            val sSplit = s.split(" ")

    if (sSplit.size != pattern.length) return false

    val map = mutableMapOf<String, String>()

    for ((pat, mS) in pattern.toList().zip(sSplit)) {
        if (!map.keys.contains(pat.toString())  && !map.values.contains(mS)) {
            map[pat.toString()] = mS
        } else if (map[pat.toString()] == mS) {
            continue
        } else return false
    }

    return true
    }
}