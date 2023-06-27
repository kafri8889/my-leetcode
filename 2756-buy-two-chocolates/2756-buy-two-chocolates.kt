class Solution {
    fun buyChoco(prices: IntArray, money: Int): Int {
        prices.sort()
        
        var buy = 0
    var m = money

    for (price in prices) {
        if (m.minus(price).let { m = it; it >= 0 }) {
            if (buy.plus(1).let { buy = it; it == 2 }) break
        } else break
    }

    return if (buy < 2) money else m
    }
}