class Solution {
fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
    return IntArray(nums.size).apply {
        for ((i, num1) in nums.withIndex()) for ((j, num2) in nums.withIndex()) {
            set(i, get(i).let { if (j != i && num2 < num1) it + 1 else it })
        }
    }
}
}