class Solution {
val vowels = charArrayOf('a', 'i', 'u', 'e', 'o')

fun maxVowels(s: String, k: Int): Int {
    var sum = 0
    for (i in 0 until k) if (s[i] in vowels) sum++
    var wsum = sum
    for (i in k until s.length) {
        wsum += (if (s[i] in vowels) 1 else 0) - (if (s[i - k] in vowels) 1 else 0)
        sum = Math.max(sum, wsum)
    }

    return sum.coerceAtMost(k)
}
}