class Solution {
fun rotate(matrix: Array<IntArray>) {
    transpose(matrix)
    for (arr in matrix) reverse(arr)
}

fun transpose(arr: Array<IntArray>) {
    for (i in arr.indices) {
        for (j in i + 1 until arr.size) {
            arr[i][j] = arr[j][i].also { arr[j][i] = arr[i][j] }
        }
    }
}

fun reverse(arr: IntArray) {
    var j = arr.lastIndex
    for (i in arr.indices) {
        arr[i] = arr[j].also { arr[j] = arr[i] }
        if (i == j || i + 1 == j) break
        j--
    }
}
}