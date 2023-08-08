class Solution {
    fun isPalindrome(x: Int): Boolean {
        val s = x.toString()
        for (i in s.indices) {
            if (s[i] != s[s.lastIndex - i]) return false
        }
        return true
    }
}