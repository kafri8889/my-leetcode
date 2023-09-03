class Solution {
fun decompressRLElist(nums: IntArray): IntArray {
    return arrayListOf<Int>().apply {
        for (i in nums.indices step 2) repeat(nums[i]) { add(nums[i + 1]) }
    }.toIntArray()
}
}