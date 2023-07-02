class Solution {
    fun isMonotonic(nums: IntArray): Boolean {
        var increase = true
    var decrease = true

    for ((i, num) in nums.withIndex()) {
        val next = nums.getOrNull(i + 1) ?: break
        when {
            num < next -> increase = false
            num > next -> decrease = false
        }
    }

    return increase || decrease
    }
}