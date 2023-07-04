/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        val reversed = head?.getVals()
    reversed?.toMutableList()?.reverse()
    return reversed?.toListNode()
    }

    // Ubah int list menjadi ListNode
fun List<Int>.toListNode(): ListNode? {
    if (isEmpty()) return null
    var child: ListNode? = null
    for (num in this) {
        if (child == null) child = ListNode(num)
        else child = ListNode(num).apply { next = child }
    }
    return child
}

// Convert list node menjadi int list
// input: ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5, null)))))
// output: [1,2,3,4,5]
fun ListNode.getVals(): List<Int> {
    return arrayListOf<Int>().apply {
        var currHead: ListNode? = this@getVals
        while (true) {
            if (currHead == null) break
            add(currHead.`val`)
            currHead = currHead.next
        }
    }
}
}