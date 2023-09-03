class Solution {
    fun decode(encoded: IntArray, first: Int): IntArray {
        return IntArray(encoded.size + 1).apply {
            set(0, first)
            for (i in encoded.indices) {
                val v = if (i == 0) encoded[i] xor first else get(i) xor encoded[i]
                set(i + 1, v)
            }
        }
    }
}