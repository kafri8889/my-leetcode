class Solution {
    fun defangIPaddr(address: String): String {
        var r = ""
    for (c in address) r += if (c == '.') "[.]" else c
    return r
    }
}