class Solution {
    fun reversePrefix(word: String, ch: Char): String {
        var s2 = ""
    var toReverse = ""
    var found = false
    for (c in word) {
        if (found) s2 += c
        else toReverse += c
        if (c == ch) found = true
    }
    return (if (found) toReverse.reversed() else toReverse) + s2
    }
}