class Solution {
    fun interpret(command: String): String {
        var mcommand = ""
        var isAl = false
        loop@ for (c in command) {
            when (c) {
                '(', 'l' -> continue@loop
                'a' -> {
                    isAl = true
                    continue@loop
                }
                'G' -> mcommand += c
                ')' -> {
                    if (isAl) {
                        mcommand += "al"
                        isAl = false
                    } else mcommand += 'o'
                }
            }
        }
        return mcommand
    }
}