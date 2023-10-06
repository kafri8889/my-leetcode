class Solution {
fun sumOfUnique(nums: IntArray): Int {
    var sum = 0
    for ((num, count) in counter(nums.iterator())) if (count == 1) sum += num
    return sum
}

fun <T> counter(iter: Iterator<T>): HashMap<T, Int> {
    return hashMapOf<T, Int>().apply {
        for (t in iter) set(t, if (t in keys) get(t)!! + 1 else 1)
    }
}
}