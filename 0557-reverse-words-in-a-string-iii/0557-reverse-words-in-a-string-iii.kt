class Solution {
fun reverseWords(s: String): String {
    val ms = " $s"
    var news = ""
    var temp = ""
    for (i in ms.lastIndex downTo 0) {
        if (ms[i].isWhitespace()) {
            news = "$temp $news"
            temp = ""
        } else temp += ms[i]
    }
    return news.trim()
}
}