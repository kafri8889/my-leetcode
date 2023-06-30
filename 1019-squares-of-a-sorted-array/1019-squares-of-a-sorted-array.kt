class Solution {
    fun sortedSquares(nums: IntArray): IntArray {
        return nums.map { Math.pow(it.toDouble(), 2.0).toInt() }.sorted().toIntArray()
    }
}