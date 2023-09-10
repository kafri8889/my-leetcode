class Solution {
fun uncommonFromSentences(s1: String, s2: String): Array<String> {
    return arrayListOf<String>().apply {
        Hashtable<String, Int>().apply {
            for (s in ("$s1 $s2").split(' ')) if (containsKey(s)) set(s, get(s)!! + 1) else put(s, 1)
        }.let { for ((k, v) in it) if (v == 1) add(k) }
    }.toTypedArray()
}
}