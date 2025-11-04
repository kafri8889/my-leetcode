class Solution {
    fun maxProduct(nums: IntArray): Int {
        nums.sort()

        return (nums[nums.lastIndex] - 1) * (nums[nums.lastIndex - 1] - 1)
    }
}