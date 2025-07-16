class Solution {
fun findNumbers(nums: IntArray): Int {
    var i = 0
    for (n in nums) {
        var mn = n
        var j = 0
        while (mn > 0) {
            mn /= 10
            j++
        }

        if (j % 2 == 0) i++
    }

    return i
}
}