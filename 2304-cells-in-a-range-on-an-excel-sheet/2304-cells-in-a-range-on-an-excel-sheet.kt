class Solution {
fun cellsInRange(s: String): List<String> {
    val strs = Array(1 + s[3].code - s[0].code) { s[0] + it }
    val nums = Array(1 + s[4].digitToInt() - s[1].digitToInt()) { s[1].digitToInt() + it }
    return arrayListOf<String>().apply {
        for (c in strs) for (n in nums) add("$c$n")
    }
}
}