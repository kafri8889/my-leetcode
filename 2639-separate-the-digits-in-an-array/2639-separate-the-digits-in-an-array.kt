class Solution {
 fun separateDigits(nums: IntArray): IntArray {
    return arrayListOf<Int>().apply {
        for (num in nums) addAll(num.toString().map { Character.digit(it, 10) })
    }.toIntArray()
}
}