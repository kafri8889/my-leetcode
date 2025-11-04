class Solution {
    fun findMissingAndRepeatedValues(grid: Array<IntArray>): IntArray {
    var duplicated = -1
    var missing = -1
    val map = sortedMapOf<Int, Int>()

    for (i in grid.indices) {
        for (j in grid[0].indices) {
            if (map.containsKey(grid[i][j])) map[grid[i][j]] = map[grid[i][j]]!! + 1
            else map[grid[i][j]] = 1
        }
    }


    for ((k, v) in map) {
        if (v > 1) duplicated = k
    }

    var prev = 0
    var found = false
    for (n in map.keys) {
        if (prev + 1 != n) {
            found = true
            missing = prev + 1
        }

        prev = n
    }

    if (!found) missing = map.keys.last() + 1

    return intArrayOf(duplicated, missing)
}
}