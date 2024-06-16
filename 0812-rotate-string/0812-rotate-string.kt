class Solution {
    fun rotateString(s: String, goal: String): Boolean {
        if (goal.length < s.length) return false
        return goal in (s + s)
    }
}