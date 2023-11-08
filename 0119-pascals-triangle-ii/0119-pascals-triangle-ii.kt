class Solution {
fun getRow(rowIndex: Int): List<Int> {
    val triangle = arrayListOf<IntArray>().apply {
        add(intArrayOf(1))
        add(intArrayOf(1,1))
    }

    if (rowIndex > 1) {
        for (i in 2..rowIndex) {
            val arr = IntArray(triangle[i - 1].size + 1).apply {
                set(0, 1)
                set(lastIndex, 1)
            }

            // if ganjil else genap
            val range = if (arr.size % 2 != 0) 1..(arr.size / 2) else 1 until (arr.size / 2)

            for (j in range) {
                arr[j] = triangle[i - 1][j] + triangle[i - 1][j - 1]

                // -1 karena nilai awal dan akhir sudah kita tetapkan yaitu "1"
                arr[arr.size - 1 - j] = arr[j]
            }

            triangle.add(arr)
        }
    }

    return triangle[rowIndex].toList()
}
}