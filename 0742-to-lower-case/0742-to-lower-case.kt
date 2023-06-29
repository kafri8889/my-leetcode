class Solution {
    fun toLowerCase(s: String): String {
            var lower = ""
    for (c in s) {
        // Cek apakah upppercase
        lower += if (c.toInt() in 65..90) {
            (c.toInt() + 32).toChar() // Ke lower case
        } else c
    }

    return lower
    }
}