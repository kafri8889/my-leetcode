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
fun hasCycle(head: ListNode?): Boolean {
    if (head?.next == null) return false

    var point1 = head
    var point2 = head

    while (point1 != null && point2 != null) {
        point1 = point1.next
        point2 = point2.next?.next

        if (point1 == point2) return true
    }

    return false
}
}