class Solution {
fun numberOfSteps(num: Int): Int {
    return num.toString(2).foldIndexed(0) { i, acc, binary ->
        when {
            (i == 0 && binary.digitToInt() == 1) || (binary.digitToInt() == 0 && i != 0) -> acc + 1
            binary.digitToInt() == 1 -> acc + 2
            else -> acc
        }
    }
}
}