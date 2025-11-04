class Solution {
    fun finalPrices(prices: IntArray): IntArray {

    for (i in prices.indices) {
        var disc = 0
        for (j in i + 1 until prices.size) {
            if (prices[j] <= prices[i]) {
                disc = prices[j]
                break
            }
        }

        prices[i] -= disc
    }

    return prices
}
}