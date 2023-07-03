class Solution {
    fun maximumValue(strs: Array<String>): Int {
        var max = Int.MIN_VALUE
        for (str in strs) {
            val int = str.toIntOrNull()
            max = Math.max(max, int ?: str.length)
        }

        return max
    }
}