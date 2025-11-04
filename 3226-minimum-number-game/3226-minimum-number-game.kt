class Solution {
    fun numberGame(nums: IntArray): IntArray {
    bubbleSort(nums)

    for (i in 0 until nums.size / 2) {
        swap(nums, i * 2, i * 2 + 1)
    }

    return nums
}

private fun swap(arr: IntArray, i: Int, j: Int) {
    arr[i] = arr[j].also { arr[j] = arr[i] }
}

private fun shouldSwap(n1: Int, n2: Int, ascending: Boolean): Boolean = if (ascending) n1 < n2 else n1 > n2

fun bubbleSort(arr: IntArray, ascending: Boolean = true) {
    if (arr.size <= 1) return

    for (x in arr.indices) {
        for (i in arr.indices) {
            if (i == arr.size - 1) break
            if (shouldSwap(arr[i + 1], arr[i], ascending)) swap(arr, i, i + 1)
        }
    }
}
}