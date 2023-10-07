class Solution {
fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
    return binarySearchMatrix(matrix, target, 0, matrix.size * matrix[0].size)
}

fun binarySearchMatrix(array: Array<IntArray>, x: Int, low: Int, high: Int): Boolean {
    if (high >= low) {
        val mid = low + (high - low) / 2
        val i = mid / array[0].size
        val j = mid % array[0].size

        return when {
            array.getOrNull(i)?.getOrNull(j) == null -> false
            array[i][j] == x -> true
            array[i][j] < x -> binarySearchMatrix(array, x, mid + 1, high)
            array[i][j] > x -> binarySearchMatrix(array, x, low, mid - 1)
            else -> false
        }
    }

    return false
}
}