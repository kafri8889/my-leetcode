class Solution {
    fun judgeCircle(moves: String): Boolean {
        val count: Map<Char, Int> = moves.groupingBy { it }.eachCount()
    return count['U'] == count['D'] && count['L'] == count['R']
    }
}