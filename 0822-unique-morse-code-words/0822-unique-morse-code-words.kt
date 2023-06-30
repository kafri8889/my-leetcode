class Solution {
    val morse = arrayOf(
    ".-" to 'a',"-..." to 'b',"-.-." to 'c',"-.." to 'd',"." to 'e',"..-." to 'f',"--." to 'g',"...." to 'h',
    ".." to 'i',".---" to 'j', "-.-" to 'k', ".-.." to 'l',"--" to 'm',"-." to 'n',"---" to 'o',".--." to 'p',"--.-" to 'q',
    ".-." to 'r', "..." to 's',"-" to 't',"..-" to 'u', "...-" to 'v', ".--" to 'w',"-..-" to 'x',"-.--" to 'y',"--.." to 'z'
)

fun uniqueMorseRepresentations(words: Array<String>): Int {
    val set = mutableSetOf<String>()
    for (word in words) {
        set.add(word.map { c -> morse.find { it.second == c }!!.first }.joinToString(""))
    }
    return set.size
}
}