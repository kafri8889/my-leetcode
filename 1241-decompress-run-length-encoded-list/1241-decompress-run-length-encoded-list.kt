class Solution {
fun decompressRLElist(nums: IntArray): IntArray {
    return arrayListOf<Int>().apply {
        var i = 0
        var j = 1
        for (z in 0 until nums.size / 2) {
            for (y in 0 until nums[i]) add(nums[j])
            i += 2
            j += 2
        }
    }.toIntArray()
}
}