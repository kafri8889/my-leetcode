class Solution {
fun numberOfSteps(num: Int): Int {
    var mnum = num
    var steps = 0

    while (mnum > 0) {
        if (mnum % 2 == 0) mnum /= 2 else mnum--
        steps++
    }

    return steps
}
}