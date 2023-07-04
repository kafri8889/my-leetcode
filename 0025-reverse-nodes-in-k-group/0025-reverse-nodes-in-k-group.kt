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
    fun reverseKGroup(head: ListNode?, k: Int): ListNode? {
    var child: ListNode? = null
    val reversed = head?.getVals()?.split(k)?.mapIndexed { i, v ->
        if (v.size >= k) v.reversed() else v
    }
    reversed?.let {
        for (num in it.flatten().reversed()) {
            if (child == null) child = ListNode(num)
            else child = ListNode(num).apply { next = child }
        }
    }
    return child
}

fun <T> List<T>.split(k: Int): List<List<T>> {
    return arrayListOf<List<T>>().apply {
        val temp = arrayListOf<T>()
        var counter = 0
        for ((i, t) in this@split.withIndex()) {
            counter++
            val cTemp = temp.apply { add(t) }.clone() as List<T>
            if (counter == k) add(cTemp).also { counter = 0; temp.clear() }
            else if (i == this@split.lastIndex && counter < k) add(cTemp)
        }
    }
}

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