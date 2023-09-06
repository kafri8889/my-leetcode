class Solution {
fun splitWordsBySeparator(words: List<String>, separator: Char): List<String> {
    return arrayListOf<String>().apply {
        var joinedWords = ""
        var sToAdd = ""
        for (s in words) joinedWords += "$s$separator"
        for (c in joinedWords) {
            if (c == separator && sToAdd.isNotBlank()) add(sToAdd).also { sToAdd = "" }
            else if (c != separator) sToAdd += c
        }
    }
}
}