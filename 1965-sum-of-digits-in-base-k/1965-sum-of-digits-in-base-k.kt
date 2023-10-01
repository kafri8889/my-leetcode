class Solution {
    fun sumBase(n: Int, k: Int): Int = n.toString(k).sumOf { it.digitToInt() }
}