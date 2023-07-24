class Solution {
    fun mostWordsFound(sentences: Array<String>): Int {
        var max = 0
    for (sentence in sentences) {
        val split = sentence.split(" ").size
        if (split > max) max = split
    }
    return max
    }
}