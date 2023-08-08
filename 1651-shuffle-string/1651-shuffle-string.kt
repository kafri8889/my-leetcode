class Solution {
fun restoreString(s: String, indices: IntArray): String {
    return Array(s.length) {""}.apply {
        for (i in s.indices) set(indices[i], s[i].toString())
    }.joinToString("")
}
}