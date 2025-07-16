class Solution {
    fun findClosest(x: Int, y: Int, z: Int): Int {
    val p1 = abs(x-z)
    val p2 = abs(y-z)

    return if (p1 == p2) 0 else if (p1 > p2) 2 else 1
}
}