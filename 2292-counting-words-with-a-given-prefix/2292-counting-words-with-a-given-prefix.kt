class Solution {
fun prefixCount(words: Array<String>, pref: String): Int {
    var tot = 0
    for (word in words) if (word.startsWith(pref)) tot++
    return tot
}
}