class Solution {
    fun sortTheStudents(score: Array<IntArray>, k: Int): Array<IntArray> {
        return score.sortedByDescending { it[k] }.toTypedArray()
    }
}