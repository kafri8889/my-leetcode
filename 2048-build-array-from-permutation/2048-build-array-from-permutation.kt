class Solution {
    fun buildArray(nums: IntArray): IntArray {
            return IntArray(nums.size).apply { for (i in nums.indices) set(i, nums[nums[i]]) }
    }
}