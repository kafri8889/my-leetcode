class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
    var s = ""

    var word1Index = 0
    var word2Index = 0
    var useWord1 = true
    while (s.length < word1.length + word2.length) {
        val c1 = word1.getOrNull(word1Index).also { if (useWord1) word1Index++ }
        val c2 = word2.getOrNull(word2Index).also { if (!useWord1) word2Index++ }

        s += if (useWord1 && c1 != null) c1
        else if (!useWord1 && c2 != null) c2
        else ""

        useWord1 = !useWord1
    }

    return s
}
}