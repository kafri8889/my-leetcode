class Solution {
    fun moveZeroes(nums: IntArray): Unit {
    if(nums.size == 1) return
    var p1 = 0
    var p2 = 1
    var movedZero = 0
    val totalZero = nums.count { it == 0 }
    while (totalZero > movedZero) {
        if (nums[p1] < Math.abs(nums[p2]) && nums[p1] == 0) {
            // Swap
            nums[p1] = nums[p2].also { nums[p2] = nums[p1] }
        }
        if (p2 >= nums.lastIndex) {
            p2 = 1.also { p1 = 0 }
            movedZero++
            continue
        }
        p2++
        p1++
    }
    }
}