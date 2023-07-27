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
fun mergeNodes(head: ListNode?): ListNode? {
    var currSum = 0
    var resNodeHead: ListNode? = null
    var resNodeTail: ListNode? = null
    var currNode: ListNode? = head

    while (currNode != null) {
        if (currNode.`val` == 0 && currSum != 0) {
            ListNode(currSum).let {
                if (resNodeHead == null) resNodeHead = it.also { resNodeTail = it }
                else resNodeTail?.next = it.also { resNodeTail = it }
                currSum = 0
            }
        } else currSum += currNode.`val`
        currNode = currNode.next
    }

    return resNodeHead
}
}