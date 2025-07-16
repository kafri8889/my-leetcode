class Solution {
    fun kthCharacter(k: Int): Char {
    var generated = "a"

    for (i in 0 until k) {
        for (c in generated) {
            generated += Char(c.code + 1)
        }

        if (generated.length >= k) break
    }

    return generated[k - 1]
}
}