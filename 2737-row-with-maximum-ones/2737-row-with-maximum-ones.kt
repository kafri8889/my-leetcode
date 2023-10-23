class Solution {
    fun rowAndMaximumOnes(mat: Array<IntArray>): IntArray {
        var minIndexMaxOnes = 0 to 0

        for (i in mat.indices) {
            mat[i].count { it == 1 }.let {
                if (it > minIndexMaxOnes.second) minIndexMaxOnes = i to it
            }
        }

        return intArrayOf(minIndexMaxOnes.first, minIndexMaxOnes.second)
    }
}