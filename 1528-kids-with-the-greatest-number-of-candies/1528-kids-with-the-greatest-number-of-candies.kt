class Solution {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        val max = candies.let {
        var m = 0
        for (i in it) { if (i > m) m = i }
        m
    }
    return candies.map { it + extraCandies }.map { it >= (max ?: 0) }
    }
}