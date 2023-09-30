class Solution {
fun alternateDigitSum(n: Int): Int {
    return n.toString().foldIndexed(0) { i, acc, c ->
        acc + if (i % 2 == 0) c.digitToInt() else -c.digitToInt()
    }
}
}