class Solution {
    
    fun finalValueAfterOperations(operations: Array<String>): Int {
        var x = 0
    for (operation in operations) if (operation == "++X" || operation == "X++") x += 1 else x -= 1
    return x
    }
}