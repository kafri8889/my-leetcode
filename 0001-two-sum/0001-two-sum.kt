class Solution {
fun twoSum(nums: IntArray, target: Int): IntArray {
    hashMapOf<Int, Int>().apply {
        for (i in nums.indices) {
            if (containsKey(nums[i])) return intArrayOf(get(nums[i])!!, i)
            else set(target - nums[i], i)
        }
    }
    return intArrayOf()
}
}