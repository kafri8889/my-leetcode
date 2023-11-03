class Solution {
fun isCircularSentence(sentence: String): Boolean {
    var firstChar: Char
    var lastChar: Char
    for (i in 1 until sentence.length) {
        if (sentence.getOrNull(i + 1) == null) {
            lastChar = sentence[i]
            if (sentence[0] != lastChar) return false
        }
        if (sentence.getOrNull(i + 1)?.isWhitespace() == true) {
            firstChar = sentence[i]
            lastChar = sentence[i + 2]

            if (firstChar != lastChar) return false
        }
    }

    return true
}
}