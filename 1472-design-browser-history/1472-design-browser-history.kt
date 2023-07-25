class BrowserHistory(homepage: String) {

    private class ListNodeString(var value: String) {
        var next: ListNodeString? = null
    }

    private var head: ListNodeString? = null
    private var tail: ListNodeString? = null

    private val ListNodeString.previous: ListNodeString?
        get() {
            var currNode: ListNodeString? = head
            while (currNode != null) {
                if (currNode.next == this) return currNode
                currNode = currNode.next
            }

            return null
        }

    init { visit(homepage) }

    fun visit(url: String) {
        ListNodeString(url).let {
            if (head == null) head = it.also { tail = it }
            else tail?.next = it.also { tail = it }
        }
    }

    fun back(steps: Int): String {
        var mSteps = steps
        var curr = tail
        while (mSteps != 0) {
            val prev = curr?.previous ?: break
            curr = prev
            mSteps--
        }
        tail = curr
        return curr?.value ?: ""
    }

    fun forward(steps: Int): String {
        var mSteps = 0
        var curr = tail
        while (mSteps < steps) {
            if (curr?.next == null) break
            curr = curr.next
            mSteps++
        }
        tail = curr
        return curr?.value ?: ""
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * var obj = BrowserHistory(homepage)
 * obj.visit(url)
 * var param_2 = obj.back(steps)
 * var param_3 = obj.forward(steps)
 */