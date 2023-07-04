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
    fun deleteMiddle(head: ListNode?): ListNode? {
    return head?.getVals()?.toMutableList()?.apply {
        val indexToRemove = if (size % 2 != 0) (size - 1) / 2 else size / 2
        removeAt(indexToRemove)
    }?.toListNode()
}

// Ubah int list menjadi ListNode
fun Collection<Int>.toListNode(): ListNode? {
    var child: ListNode? = null
    for (num in this.reversed()) {
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