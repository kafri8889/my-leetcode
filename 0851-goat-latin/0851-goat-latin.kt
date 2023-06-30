class Solution {
    val vowel = arrayOf('a', 'i', 'u', 'e', 'o')

fun toGoatLatin(sentence: String): String {
    val split = sentence.split(" ")
    var goatSentence = ""

    for (i in split.indices) {
        if (i != 0) goatSentence += " "

        if (split[i][0].toLowerCase() in vowel) goatSentence += split[i] + "ma"
        else split[i].run { goatSentence += substring(1, length) + get(0) + "ma" }

        repeat(i + 1) { goatSentence += 'a' }
    }

    return goatSentence
}
}