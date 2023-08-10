class Solution {
fun isSubsequence(s: String, t: String): Boolean {
    if (s.isBlank()) return true

    var currentChar = 0
    var subseq = ""
    for (c in t) {
        if (s[currentChar] == c) subseq += s[currentChar].also { currentChar++ }
        if (subseq == s) return true
    }

    return false
}
}