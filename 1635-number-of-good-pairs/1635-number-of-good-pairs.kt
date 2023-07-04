class Solution {
    fun numIdenticalPairs(nums: IntArray): Int {
        var good = 0
    for (i in nums.indices) for (j in nums.indices) if (nums[i] == nums[j] && i < j) good += 1
    return good
    }
}