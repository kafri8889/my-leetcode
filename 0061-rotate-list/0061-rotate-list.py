# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def rotateRight(self, head: ListNode, k: int) -> ListNode:
        if k == 0 or head == None or head.next == None:
            return head

        length = 0
        curr = head
        while curr is not None:
            length += 1
            curr = curr.next

        # Jika Rotasi k lebih dari panjang linked list akan sama seperti rotasi k % length
        k = k % length
        if k == 0:
            return head

        newHead: ListNode = head
        for _ in range(k):
            tail = head
            while tail.next and tail.next.next:
                tail = tail.next

            newHead = tail.next
            tail.next = None  # Putus link
            newHead.next = head
            head = newHead  # Update head

        return newHead