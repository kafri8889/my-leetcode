class Solution {
fun findDelayedArrivalTime(arrivalTime: Int, delayedTime: Int): Int {
    val sum = arrivalTime + delayedTime
    return if (sum < 24) sum else sum - 24
}
}