class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        val result = arrayListOf<List<Int>>()
    for (i in 1..numRows) {
        val li = arrayListOf<Int>().apply { add(1) }
        var jFirst = 0
        var jLast = 1

        if (i == 2) li.add(1)
        if (i > 2) {
            for (j in 0 until i - 2) {
                li.add(result[i - 2][jFirst] + result[i - 2][jLast])
                jFirst += 1
                jLast += 1
            }

            li.add(1)
        }

        result.add(li)
    }

    return result
    }
}