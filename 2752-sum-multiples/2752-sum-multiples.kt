class Solution {
    fun sumOfMultiples(n: Int): Int {
        var sum = 0
    for (i in 1..n) if (i.toDouble() % 3.0 == 0.0 || i.toDouble() % 5.0 == 0.0 || i.toDouble() % 7.0 == 0.0) sum += i
    return sum
    }
}