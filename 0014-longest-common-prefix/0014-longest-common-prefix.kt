class Solution {
fun longestCommonPrefix(strs: Array<String>): String {
    var pref = ""
    for (i in 0 until (strs.max()?.length ?: 0)) {
        val allEquals = strs.all { try { it[i] == strs[0][i] } catch (e: Exception) { false } }
        if (allEquals) pref += strs[0][i] else break
    }
    return pref
}
}