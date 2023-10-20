class Solution {
fun isBoomerang(points: Array<IntArray>): Boolean {
    // Area of triangle from coordinate
    // A = (1/2) * (x1(y2 - y3) + x2(y3 - y1) + x3(y1 - y2))

    return 0.5f * (
            (points[0][0] * (points[1][1] - points[2][1])) +
            (points[1][0] * (points[2][1] - points[0][1])) +
            (points[2][0] * (points[0][1] - points[1][1]))
    ) != 0f
}
}