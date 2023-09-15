class Solution {
fun uncommonFromSentences(s1: String, s2: String): Array<String> {
    val arr = arrayListOf<String>()
    val hash = Hashtable<String, Int>()
    val combinedString = ("$s1 $s2").split(' ') // ["this", "apple" "is", "sweet", "this", "apple"....]

    for (s in combinedString) {
        if (hash.containsKey(s)) hash[s] = hash[s]!! + 1 
        else hash[s] = 1
    }
    
    for ((k, v) in hash) {
        if (v == 1) {
            arr.add(k)
        }
    }

    return arr.toTypedArray()
}
}