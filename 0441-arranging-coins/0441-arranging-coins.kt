class Solution {
    fun arrangeCoins(n: Int): Int {
    val getNext: (Double) -> Double = {
        (it * it) / 2 + it/2
    }

    var prev = 1L
    var curr = 1L
    var count = 1L
    while (true) {
        if (n.toLong() in prev..curr) {
            if (n.toLong() == curr) count += 1
            break
        }
        count++
        prev = curr.also { curr = getNext(count.toDouble()).toLong() }
    }
    return (count - 1L).toInt()
    }
}