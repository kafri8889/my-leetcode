class Solution {
fun findMaxAverage(nums: IntArray, k: Int): Double {
    var sum = 0
    for (i in 0 until k) sum += nums[i]
    var wsum = sum
    for (i in k until nums.size) {
        wsum += nums[i] - nums[i - k]
        sum = Math.max(sum, wsum)
    }
    return sum.toDouble() / k
}
}