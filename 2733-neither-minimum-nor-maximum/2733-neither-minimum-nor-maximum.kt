class Solution {
    fun findNonMinOrMax(nums: IntArray): Int {
        val minIndex = nums.indexOf(nums.min() ?: 0)
        val maxIndex = nums.indexOf(nums.max() ?: 0)
        
        val num = nums.apply { 
            set(minIndex, Int.MIN_VALUE)
            set(maxIndex, Int.MIN_VALUE)
        }.max() ?: Int.MIN_VALUE
        
        return if (num == Int.MIN_VALUE) -1 else num
    }
}