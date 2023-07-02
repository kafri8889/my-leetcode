class Solution {
    val vowels = arrayOf('a','i','u','e','o')
fun vowelStrings(words: Array<String>, left: Int, right: Int): Int {
    var tot = 0
    for (i in left..right) if (words[i][0] in vowels && words[i][words[i].length - 1] in vowels) tot += 1
    return tot
}
}