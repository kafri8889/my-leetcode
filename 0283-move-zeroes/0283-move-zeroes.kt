class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        if (nums.size == 1) return
        
        while (true) {
        var p2 = 1
        var arrayChanged = false
        for (p1 in nums.indices) {
            if (nums[p1] < Math.abs(nums[p2]) && nums[p1] == 0) {
                // Swap
                nums[p1] = nums[p2].also { nums[p2] = nums[p1] }
                arrayChanged = true
            }
            if (p2 == nums.lastIndex) break
            p2++
        }

        // Jika tidak ada perubahan urutan, break
        if (!arrayChanged) break
        }
    }
}