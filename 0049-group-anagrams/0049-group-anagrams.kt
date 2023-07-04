class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
    return arrayListOf<List<String>>().apply {
        val sortedStr = mutableSetOf<String>()
        for (str in strs) sortedStr.add(str.sort())
        val map = mutableMapOf<String, List<String>>()
        for (str in strs) {
            map.computeIfPresent(str.sort()) { _, v -> v.toMutableList().apply { add(str) } }
            map.putIfAbsent(str.sort(), listOf(str))
        }
        addAll(map.map { it.value })
    }
}

fun String.sort(): String {
    return toCharArray().sorted().joinToString("")
}
}