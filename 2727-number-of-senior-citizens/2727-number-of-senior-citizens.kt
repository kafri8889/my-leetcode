class Solution {
fun countSeniors(details: Array<String>): Int {
    var count = 0
    for (detail in details) if (detail.slice(11..12).toInt() > 60) count++
    return count
}
}