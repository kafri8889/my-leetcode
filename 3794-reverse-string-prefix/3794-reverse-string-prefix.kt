class Solution {
fun reversePrefix(s: String, k: Int): String {
    val arr = Array(s.length) { s[it] }

    var j = k - 1
    for (i in 0 until k) {
        if (i >= j) break
        arr[i] = s[j].also { arr[j] = s[i] }
        j--
    }

    return arr.joinToString("")
}
}