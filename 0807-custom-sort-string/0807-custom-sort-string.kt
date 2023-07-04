class Solution {
    fun customSortString(order: String, s: String): String {
        var sorted = ""
    var ss = s
    for (c in order) {
        if (c in s) sorted += s.filter { it == c }.also { ss = ss.replace(it[0].toString(), "") }
    }
    return sorted + ss
    }
}