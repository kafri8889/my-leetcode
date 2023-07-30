class Solution {
    fun sortSentence(s: String): String {
            val split = s.split(" ")
    val arr = Array(split.size) { "" }

    for (s1 in split) {
        arr[Character.digit(s1[s1.lastIndex].toInt(), 10) - 1] = s1.substring(0, s1.lastIndex)
    }
    return arr.joinToString(" ")
    }
}