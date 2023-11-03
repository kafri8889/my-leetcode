class Solution {
fun buildArray(target: IntArray, n: Int): List<String> {
    return arrayListOf<String>().apply {
        for (stream in 1..n) {
            add("Push")
            if (stream !in target) add("Pop")
            if (stream == target[target.lastIndex]) break
        }
    }
}
}