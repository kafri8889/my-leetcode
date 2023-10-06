class Solution {
fun countGoodTriplets(arr: IntArray, a: Int, b: Int, c: Int): Int {
    var good = 0
    for (i in arr.indices) {
        for (j in arr.indices) {
            for (k in arr.indices) {
                if (
                    abs(arr[i] - arr[j]) <= a &&
                    abs(arr[j] - arr[k]) <= b &&
                    abs(arr[i] - arr[k]) <= c &&
                    i < j && j < k
                ) good++
            }
        }
    }

    return good
}
}