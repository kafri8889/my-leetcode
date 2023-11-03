class Solution {
fun differenceOfSums(n: Int, m: Int): Int {
    return (1..n).fold(0) { acc, i ->
        if (i % m == 0) acc - i
        else acc + i
    }
}
}