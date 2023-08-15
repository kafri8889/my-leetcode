class Solution {
fun reverseOnlyLetters(s: String): String {
    val li = arrayListOf<Char>()
    for (i in s.lastIndex downTo 0) if (s[i].isLetter()) li.add(s[i])
    for (i in s.indices) if (!s[i].isLetter()) li.add(i, s[i])
    return li.joinToString("")
}
}