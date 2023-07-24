class Solution {
    fun checkIfPangram(sentence: String): Boolean {
        val set = mutableSetOf<Char>()
        for (c in sentence) set.add(c)
        return set.size == 26
    }
}