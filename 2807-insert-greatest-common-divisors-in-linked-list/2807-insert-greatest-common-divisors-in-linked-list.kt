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
fun insertGreatestCommonDivisors(head: ListNode?): ListNode? {
    var currNode: ListNode? = head
    while (true) {
        if (currNode?.next != null) {
            val gcd = gcd(currNode.`val`, currNode.next!!.`val`)
            val temp = currNode.next
            currNode.next = ListNode(gcd).apply {
                next = temp.also { currNode = it }
            }
            continue
        }

        break
    }

    return head
}

fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a else gcd(b, a % b)
}
}