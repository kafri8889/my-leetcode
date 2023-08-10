class Solution {
fun reverseWords(s: String): String {
    var res = ""
    val split = s.split(" ")
    for (i in split.lastIndex downTo 0) {
        val s = split[i]
        if (s.isNotBlank()) res += "$s "
    }
    return res.replace("^[ \\t]+|[ \\t]+\$".toRegex(), "")
}
}