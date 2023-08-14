class Solution {
fun reverseString(s: CharArray) {
    var j = s.lastIndex
    for (i in s.indices) {
        val temp = s[i]
        s[i] = s[j]
        s[j] = temp
        j--

        if (i == j || j == s.size / 2 && i == (s.size /2) - 1) break
    }
}
}