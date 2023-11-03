class Solution {
fun maximumDifference(nums: IntArray): Int {
    var diff = -1
    for (i in nums.indices) for (j in nums.indices) {
        if (nums[i] < nums[j] && i < j) diff = max(diff, nums[j] - nums[i])
    }
    return diff
}
}