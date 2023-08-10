class Solution {
fun longestOnes(nums: IntArray, k: Int): Int {
    var max = 0
    for (i in nums.indices) {
        var tot = 0
        var chance = k
        loop@ for (j in i until nums.size) {
            when {
                nums[j] == 1 -> tot++
                nums[j] == 0 && chance != 0 -> tot += 1.also { chance-- }
                else -> break@loop
            }
        }
        max = Math.max(max, tot)
    }
    return max
}
}