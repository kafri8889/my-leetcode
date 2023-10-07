class Solution {
fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
    // for loop from 0 until m x n matrix size
    for (n in 0 until matrix.size * matrix[0].size) {
        // Convert 1D array index to 2D array index
        if (matrix[n / matrix[0].size][n % matrix[0].size] == target) return true
    }

    return false
}
}