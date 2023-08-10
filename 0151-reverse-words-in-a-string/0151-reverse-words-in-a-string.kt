class Solution {
fun reverseWords(s: String): String {
    var res = ""
    val split = s.split(" ")
    for (i in split.lastIndex downTo 0) {
        val s = split[i]
        if (s.isNotBlank()) {
            res += s
            if (i != 0) res += " "
        }
    }
    return if (res.last().isWhitespace()) res.substring(0, res.lastIndex) else res
}
}