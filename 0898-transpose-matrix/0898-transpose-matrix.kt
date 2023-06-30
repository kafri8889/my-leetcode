class Solution {
    fun transpose(matrix: Array<IntArray>): Array<IntArray> {
    return Array(matrix[0].size) { IntArray(matrix.size) }.apply {
        for (i in matrix.indices) {
            for (j in matrix[0].indices) {
                set(j, get(j).apply { set(i, matrix[i][j]) })
            }
        }
    }
}
}