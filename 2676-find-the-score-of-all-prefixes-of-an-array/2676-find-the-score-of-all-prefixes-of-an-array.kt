class Solution {
    fun findPrefixScore(nums: IntArray): LongArray {
        return LongArray(nums.size).apply {
        var currSum = 0L
        var max = Int.MIN_VALUE
        for ((i, num) in nums.withIndex()) {
            currSum += num + Math.max(max, num).also { max = it }
            set(i, currSum)
        }
    }
    }
}