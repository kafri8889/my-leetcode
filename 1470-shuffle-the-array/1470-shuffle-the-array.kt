class Solution {
fun shuffle(nums: IntArray, n: Int): IntArray {
    val arr = IntArray(2*n)
    for ((inc, i) in (0 until n).withIndex()) {
        arr[i + inc] = nums[i]
        arr[i + inc + 1] = nums[i + n]
    }
    return arr
}
}