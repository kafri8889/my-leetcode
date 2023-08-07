class Solution {
    fun createTargetArray(nums: IntArray, index: IntArray): IntArray {
    return arrayListOf<Int>().apply {
        for (i in nums.indices) add(index[i], nums[i])
    }.toIntArray()
}
}