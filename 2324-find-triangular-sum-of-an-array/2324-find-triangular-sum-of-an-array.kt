class Solution {
fun triangularSum(nums: IntArray): Int {
    return if (nums.size <= 1) nums[0] else triangularSum(
        IntArray(nums.size - 1).apply {
            for (i in nums.indices) {
                val num = (nums[i] + (nums.getOrNull(i + 1) ?: break)).toString().let { it[it.lastIndex] }
                set(i, num.digitToInt())
            }
        }
    )
}
}