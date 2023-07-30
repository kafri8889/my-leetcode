class Solution {
    fun diStringMatch(s: String): IntArray {
        val arr = IntArray(s.length + 1)
        var arri = 0
        var d = s.length + 1
        var i = -1
        for (ci in 0 until s.length + 1) {
            if ((s.getOrNull(ci) ?: s[s.lastIndex]) == 'D') {
                d -= 1
                arr[arri] = d
            } else {
                i += 1
                arr[arri] = i
            }

            arri += 1
        }

        return arr
    }
}