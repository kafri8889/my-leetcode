class Solution {
fun findDelayedArrivalTime(arrivalTime: Int, delayedTime: Int): Int {
    return (arrivalTime + delayedTime).let { if (it < 24) it else it - 24 }
}
}