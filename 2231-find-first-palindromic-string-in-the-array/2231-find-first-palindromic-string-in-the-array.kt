class Solution {
fun firstPalindrome(words: Array<String>): String {
    for (i in words.indices) if (words[i].isPalindrome()) return words[i]
    return ""
}

fun String.isPalindrome(): Boolean {
    var j = lastIndex
    for (i in indices) {
        if (i == j) return true
        if (get(i) != get(j)) return false
        j--
    }
    return true
}
}