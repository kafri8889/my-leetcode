class Solution {
fun minimumAverage(nums: IntArray): Double {
    Arrays.sort(nums)

    var i = 0
    var j = nums.lastIndex
    var avg = Double.MAX_VALUE

    while (i < j) {
        var min = nums[i]
        var max = nums[j]

        if ((min + max) / 2.0 < avg) avg = (min + max) / 2.0
        i++
        j--
    }

    return avg
}
}