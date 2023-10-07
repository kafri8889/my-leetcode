class Solution {
fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
    var i = 0
    var j = 0

    // for loop from 0 until m x n matrix size
    for (x in 0 until matrix.size * matrix[0].size) {
        println("i, j: $i, $j")
        if (matrix[i][j] == target) return true
        if (j == matrix[0].lastIndex) {
            i++
            j = 0
        } else j++
    }

    return false
}
}