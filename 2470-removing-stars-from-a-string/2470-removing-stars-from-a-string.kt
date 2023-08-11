class Solution {
fun removeStars(s: String): String {
    return ArrayDeque<Char>().apply {
        for (c in s) if (c == '*') removeLast() else add(c)
    }.joinToString("")
}
}