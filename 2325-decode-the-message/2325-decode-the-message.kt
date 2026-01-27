import java.util.Hashtable

class Solution {
fun decodeMessage(key: String, message: String): String {
    val hashMap = Hashtable<Char, Char>() // key, act
    var cCode = 'a'.code - 1
    var decoded = ""

    hashMap.put(' ', ' ')

    for (c in key) {
        if (hashMap.containsKey(c) || c.isWhitespace()) continue

        hashMap[c] = (++cCode).toChar()
    }

    println(hashMap)

    for (c in message) decoded += hashMap[c]!!

    return decoded
}
}