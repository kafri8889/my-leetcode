class Solution {
fun countPairs(nums: List<Int>, target: Int): Int {
    var i = 0
    var j = 1
    var count = 0
    while (i < nums.lastIndex) {
        if (nums[i] + nums[j] < target) count++
        
        if (j == nums.lastIndex) {
            i++
            j = i + 1
            continue
        }

        j++
    }
    return count
}
}