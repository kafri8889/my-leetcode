class Solution {
fun findIntersectionValues(nums1: IntArray, nums2: IntArray): IntArray {
    val result = intArrayOf(0,0)
    val n1map = hashMapOf<Int, Int>()
    val n2map = hashMapOf<Int, Int>()

    for (i in nums1.indices) {
        if (n1map.contains(nums1[i])) n1map[nums1[i]] = n1map[nums1[i]]!! + 1
        else n1map.put(nums1[i], 1)
    }

    for (i in nums2.indices) {
        if (n2map.contains(nums2[i])) n2map[nums2[i]] = n2map[nums2[i]]!! + 1
        else n2map.put(nums2[i], 1)
    }

    for ((k, value) in n1map) {
        if (n2map.contains(k)) result[0] += value
    }

    for ((k, value) in n2map) {
        if (n1map.contains(k)) result[1] += value
    }

    return result
}
}