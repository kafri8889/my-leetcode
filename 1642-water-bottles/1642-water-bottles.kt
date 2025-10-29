class Solution {
    fun numWaterBottles(numBottles: Int, numExchange: Int): Int {
    var canDrink = numBottles
    var bottles = canDrink

    while (bottles >= numExchange) {
        val exchanged = bottles / numExchange
        canDrink += exchanged
        bottles = exchanged + (bottles % numExchange)
    }

    return canDrink
}
}