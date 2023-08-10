class Solution {

val vowels = arrayOf('a', 'i', 'u', 'e', 'o')

fun reverseVowels(s: String): String {
    val arr = s.toCharArray()
    val vow = arrayListOf<Pair<Char, Int>>().apply {
        for (i in arr.indices) if (arr[i].toLowerCase() in vowels) add(arr[i] to i)
    }
    for (i in vow.indices) {
        arr[vow[i].second] = vow[vow.lastIndex - i].first
    }
    return arr.joinToString("")
}

}