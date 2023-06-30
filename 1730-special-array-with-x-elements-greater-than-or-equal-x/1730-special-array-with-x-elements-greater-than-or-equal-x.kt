class Solution {
    fun specialArray(nums: IntArray): Int {
        for (x in 1..(nums.max() ?: 0)) {
        if (nums.filter { it >= x }.size == x) return x
    }

    return -1
    }
}