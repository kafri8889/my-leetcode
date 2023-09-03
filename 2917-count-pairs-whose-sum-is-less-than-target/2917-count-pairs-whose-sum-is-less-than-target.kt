class Solution {
fun countPairs(nums: List<Int>, target: Int): Int {
    var p = 0
    var i = 1
    var j = nums.lastIndex
    var count = 0
    while (p < nums.lastIndex) {
        if (nums[p] + nums[i] < target) count++
        if (nums[p] + nums[j] < target && i != j) count++

        // genap || ganjil
        if ((j - 1 == i && i + 1 == j) || j == i) {
            p++
            i = p + 1
            j = nums.lastIndex
            continue
        }

        i++
        j--
    }
    return count
}
}