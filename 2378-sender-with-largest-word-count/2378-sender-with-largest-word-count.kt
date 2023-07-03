class Solution {
    fun largestWordCount(messages: Array<String>, senders: Array<String>): String {
        val map = mutableMapOf<String, Int>().apply {
        for ((i, message) in messages.withIndex()) {
            val split = message.split(" ")
            computeIfPresent(senders[i]) { k, v -> v + split.size }
            putIfAbsent(senders[i], split.size)
        }
    }

    val max = map.values.max()!!.let { mx -> map.filter { it.value == mx } }

    val iterator = max.iterator()
    var maxValue = iterator.next().key
    while (iterator.hasNext()) {
        val v = iterator.next().key
        if (Comparator<String> { o1, o2 -> o1.compareTo(o2) }.compare(maxValue, v) < 0) {
            maxValue = v
        }
    }

    return maxValue
    }
}