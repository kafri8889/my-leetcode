class Solution {
fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
    val diff1 = mutableSetOf<Int>()
    val diff2 = mutableSetOf<Int>()
    for (num in nums1) if (num !in nums2) diff1.add(num)
    for (num in nums2) if (num !in nums1) diff2.add(num)
    return listOf(diff1.toList(), diff2.toList())
}
}