class Solution {
    fun findNumbers(nums: IntArray): Int {
        var i = 0
        for (n in nums) {
            if (n.toString().length % 2 == 0) i++
        }

        return i
    }
}