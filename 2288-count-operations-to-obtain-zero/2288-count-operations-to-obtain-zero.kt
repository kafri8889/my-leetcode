class Solution {
    fun countOperations(num1: Int, num2: Int): Int {
    var count = 0
    var mnum1 = num1
    var mnum2 = num2
    while (mnum1 > 0 && mnum2 > 0) {
        if (mnum1 >= mnum2) mnum1 -= mnum2 else mnum2 -= mnum1
        count++
    }
    return count
    }
}