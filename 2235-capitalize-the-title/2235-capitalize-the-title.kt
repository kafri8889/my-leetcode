class Solution {
fun capitalizeTitle(title: String): String {
    var result = ""
    var temp = ""

    for (i in 0..title.lastIndex) {
        title.getOrNull(i + 1).let { c ->
            temp += title[i].lowercase()

            if ((c == null) || c.isWhitespace()) {
                println(temp)
                result += if (temp.trim().length <= 2) temp.lowercase()
                else {
                    if (temp[0].isWhitespace()) " " + temp[1].uppercase() + temp.substring(2..temp.lastIndex)
                    else temp[0].uppercase() + temp.substring(1..temp.lastIndex)
                }
                temp = ""
            }
        }
    }

    return result
}
}