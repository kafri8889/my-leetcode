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
    val list = head?.getVals()?.split(k)?.map {
        // jika size listnya lebih besar atau sama dengan k, reverse
        // k = 2, list = [[1,2],[3,4],[5]], menjadi
        // [[2,1],[4,3],[5]]
        if (it.size >= k) it.reversed() else it
    }
    
    // Ubah int list menjadi ListNode 
    list?.let {
        for (num in it.flatten().reversed()) {
            if (child == null) child = ListNode(num)
            else child = ListNode(num).apply { next = child }
        }
    }
    
    return child
}

// Split int list
// list = [1,2,3,4,5], k = 2  ==>  [[1,2],[3,4],[5]]
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