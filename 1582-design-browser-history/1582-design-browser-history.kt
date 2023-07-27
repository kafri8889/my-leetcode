class BrowserHistory(homepage: String) {

    private class DoublyListNode(var value: String) {
        var next: DoublyListNode? = null
        var prev: DoublyListNode? = null
    }

    // [2, 1, 3]

    // Node awal, contoh: 2
    private var head: DoublyListNode? = null

    // Node akhir, contoh: 3
    private var tail: DoublyListNode? = null

    init { visit(homepage) }

    // Menambahkan node di akhir
    fun visit(url: String) {
        // Node saat ini
        val node = DoublyListNode(url)

        // Jika head == null, berarti linked list ini masih kosong
        if (head == null) {
            head = node
            // Karena hanya ada 1 node, maka node akhir adalah "head"
            tail = node
        } else {
            // Jika head != null, berarti sudah ada node di linked list ini
            // Karena kita akan menambahkan node baru di akhir, maka previous node dari node saat ini adalah "tail"
            node.prev = tail

            // Menambahkan node baru
            // Contoh: [2, 1] + [3]
            //       : [2, 1, 3] | "tail" masih di 1
            tail?.next = node

            // Ubah value tail dengan node saat ini
            tail = node // tail = 3
        }
    }

    fun back(steps: Int): String {
        var mSteps = steps
        var curr = tail
        while (mSteps != 0) {
            if (curr?.prev == null) break
            curr = curr?.prev
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