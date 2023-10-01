class Solution {
fun sumBase(n: Int, k: Int): Int {
    // Cari tutorial cara convert nomor dari base M ke base N
    
    var sum = 0
    var mn = n
    while (mn > 0) {
        sum += mn % k
        mn /= k
    }
    return sum
}
}