class Solution {
    fun subtractProductAndSum(n: Int): Int {
    var sum = 0
    var times = 1
    for (c in n.toString()) {
        Character.digit(c.toInt(), 10).also { sum += it; times *= it }
    }

    return times - sum
    }
}