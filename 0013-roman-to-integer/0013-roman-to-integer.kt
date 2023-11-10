class Solution {
val romanMap = mapOf(
    'I' to 1,
    'V' to 5,
    'X' to 10,
    'L' to 50,
    'C' to 100,
    'D' to 500,
    'M' to 1000
)

fun romanToInt(s: String): Int {
    var i = 0
    var sum = 0
    while (i < s.length) {
        sum += when {
            s[i] == 'I' && s.getOrNull(i + 1) == 'V' -> 4.also { i++ }
            s[i] == 'I' && s.getOrNull(i + 1) == 'X' -> 9.also { i++ }
            s[i] == 'X' && s.getOrNull(i + 1) == 'L' -> 40.also { i++ }
            s[i] == 'X' && s.getOrNull(i + 1) == 'C' -> 90.also { i++ }
            s[i] == 'C' && s.getOrNull(i + 1) == 'D' -> 400.also { i++ }
            s[i] == 'C' && s.getOrNull(i + 1) == 'M' -> 900.also { i++ }
            else -> romanMap[s[i]]!!
        }
        i++
    }
    return sum
}
}
