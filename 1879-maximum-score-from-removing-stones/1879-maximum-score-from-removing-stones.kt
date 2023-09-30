class Solution {
fun maximumScore(a: Int, b: Int, c: Int): Int {
    var maxIndex = -1
    var minIndex = -1
    var count = 0
    val li = arrayListOf(a, b, c)
    while (true) {
        if (li.count { it <= 0 } >= 2) break

        var max = 0
        var min = Int.MAX_VALUE
        for ((i, n) in li.withIndex()) {
            if (n > max) max = n.also { maxIndex = i }
            if (n in 1.. min) min = n.also { minIndex = i }

        }

        li[maxIndex] = li[maxIndex] - 1
        li[minIndex] = li[minIndex] - 1
        count++
    }
    return count
}
}