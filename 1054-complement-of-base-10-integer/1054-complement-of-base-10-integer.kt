class Solution {
    fun bitwiseComplement(n: Int): Int {
        return n.toString(2).map { if (it == '0') '1' else '0' }.joinToString("").toInt(2)
    }
}