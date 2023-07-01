class Solution {
    fun findComplement(num: Int): Int {
        var ns = num.toString(2).map { if (it == '0') '1' else '0' }.joinToString("")

        return ns.toInt(2)
    }
}