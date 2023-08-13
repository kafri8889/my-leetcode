class Solution {
fun countCharacters(words: Array<String>, chars: String): Int {
    var sum = 0
    val count = counter(chars.iterator())
    var mcount = HashMap(count)
    for (word in words) {
        for ((i, c) in word.withIndex()) {
            if (mcount.containsKey(c) && mcount[c]!! != 0) {
                mcount[c] = mcount[c]!! - 1
                if (i == word.lastIndex) sum += word.length
            } else break
        }
        mcount = HashMap(count)
    }
    return sum
}

fun <T> counter(iter: Iterator<T>): HashMap<T, Int> {
    return hashMapOf<T, Int>().apply {
        for (t in iter) set(t, if (t in keys) get(t)!! + 1 else 1)
    }
}
}