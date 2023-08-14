class Solution {
fun reverseWords(s: String): String {
    val ms = " $s "
    var news = ""
    var j = 0
    for (i in ms.indices) {
        if (ms[i].isWhitespace()) {
            for (k in i - 1 downTo j) news += ms[k]
            j = i
        }
    }
    return news.trim()
}
}