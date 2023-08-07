class Solution {
    fun runningSum(nums: IntArray): IntArray {
    val arr = IntArray(nums.size)
    var prevVal = 0
    for (i in nums.indices) arr[i] = prevVal + nums[i].also { prevVal += it }
    return arr
}
}