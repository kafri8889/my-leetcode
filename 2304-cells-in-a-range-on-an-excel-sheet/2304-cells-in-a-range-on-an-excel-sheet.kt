class Solution {
fun cellsInRange(s: String): List<String> {
    return arrayListOf<String>().apply {
        for (c in s[0]..s[3]) {
            for (n in s[1].digitToInt()..s[4].digitToInt()) add("$c$n")
        }
    }
}
}