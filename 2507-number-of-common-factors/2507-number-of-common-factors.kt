class Solution {
fun commonFactors(a: Int, b: Int): Int {
    var tot = 0
    for (i in 1..Math.max(a, b)) if (a.toDouble() % i == 0.0 && b.toDouble() % i == 0.0) tot++
    return tot
}
}