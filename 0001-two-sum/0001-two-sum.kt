class Solution {
 fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = hashMapOf<Int, Int>()
    for (i in nums.indices) {
        if (map.containsKey(nums[i])) {
            return intArrayOf(map[nums[i]]!!, i)
        } else map[target - nums[i]] = i
    }

    return intArrayOf()
}
}