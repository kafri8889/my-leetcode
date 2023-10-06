class Solution {
fun maximizeSum(nums: IntArray, k: Int): Int {
    var sum = nums.max()
    var lastNum = sum
    for (i in 0 until k - 1) {
        lastNum++
        sum += lastNum
    }

    return sum
}
}