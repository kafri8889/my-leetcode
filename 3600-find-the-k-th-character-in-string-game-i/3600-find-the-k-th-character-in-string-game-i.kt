class Solution {
fun kthCharacter(k: Int): Char {
    var generated = "a"
    var j = 0

    for (i in 0 until k) {
        for (c in generated) {
            generated += Char(c.code + 1)
            j++

            if (j == k - 1) return Char(c.code + 1)
        }
    }

    return 'a'
}
}