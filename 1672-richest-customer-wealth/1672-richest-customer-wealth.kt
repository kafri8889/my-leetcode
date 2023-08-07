class Solution {
    fun maximumWealth(accounts: Array<IntArray>): Int {
    return accounts.fold(0) { acc, ints ->
        var sum = 0
        for (int in ints) sum += int
        Math.max(sum, acc)
    }
}
}