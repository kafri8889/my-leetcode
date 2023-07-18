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
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var reversedL1 = l1!!
    var reversedL2 = l2!!

    var result = ListNode(0)
    while (true) {
        var sum = reversedL1.`val` + reversedL2.`val`
        if (sum > 9) {
            sum -= 10
            if (reversedL1.next == null) reversedL1.next = ListNode(0)
            reversedL1.next?.apply { `val` += 1 }
        }

        result.apply { `val` = sum }

        if (reversedL1.next != null || reversedL2.next != null) {
            val new= ListNode(0)
            new.next = result
            result = new
            reversedL1 = if (reversedL1.next == null) ListNode(0) else reversedL1.next!!
            reversedL2 = if (reversedL2.next == null) ListNode(0) else reversedL2.next!!
        } else break
    }
    return reverseListNode(result)
    }

    fun reverseListNode(head: ListNode?): ListNode? {
    if (head == null) return null

    var curr = head
    var next: ListNode?
    var prev: ListNode? = null
    while (curr != null) {
        next = curr.next
        curr.next = prev
        prev = curr
        curr = next
    }

    return prev
}
}