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
    val nums = arrayListOf<Int>()
    while (i < s.length) {
        when {
            s[i] == 'I' && s.getOrNull(i + 1) == 'V' -> nums.add(4).also { i++ }
            s[i] == 'I' && s.getOrNull(i + 1) == 'X' -> nums.add(9).also { i++ }
            s[i] == 'X' && s.getOrNull(i + 1) == 'L' -> nums.add(40).also { i++ }
            s[i] == 'X' && s.getOrNull(i + 1) == 'C' -> nums.add(90).also { i++ }
            s[i] == 'C' && s.getOrNull(i + 1) == 'D' -> nums.add(400).also { i++ }
            s[i] == 'C' && s.getOrNull(i + 1) == 'M' -> nums.add(900).also { i++ }
            else -> nums.add(romanMap[s[i]]!!)
        }
        i++
    }
    return nums.sum()
}
}