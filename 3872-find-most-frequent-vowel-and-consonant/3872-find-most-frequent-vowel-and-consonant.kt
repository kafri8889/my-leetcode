class Solution {
fun maxFreqSum(s: String): Int {
    val vowels = "aiueo"
    val table = hashMapOf<Char, Int>()

    for (c in s) {
        table[c] = table.getOrDefault(c, 0) + 1
    }

    var maxVowels = 0
    var maxConsonants = 0

    for ((k, v) in table) {
        if (k in vowels) {
            if (v > maxVowels) maxVowels = v
        }
        else if (v > maxConsonants) maxConsonants = v
    }

    return maxConsonants + maxVowels
}
}