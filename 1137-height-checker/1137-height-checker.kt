class Solution {
    fun heightChecker(heights: IntArray): Int {
        var not = 0
    val expected = heights.sorted()
    for (i in heights.indices) if (heights[i] != expected[i]) not += 1
    return not
    }
}