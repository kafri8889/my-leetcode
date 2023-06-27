class Solution {
    fun minimizedStringLength(s: String): Int {
        var newS = ""
    for (c in s) if (c !in newS) newS += c
    return newS.length
    }
}