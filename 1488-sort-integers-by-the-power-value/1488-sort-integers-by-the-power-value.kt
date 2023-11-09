class Solution {
fun getKth(lo: Int, hi: Int, k: Int): Int {
    val arr = Array(hi - lo + 1) { 1 to 1 }.apply {
        for ((i, num) in (lo..hi).withIndex()) {
            var x = num
            while (x != 1) {
                if (x % 2 == 0) x /= 2 else x = 3 * x + 1
                set(i, num to get(i).second + 1)
            }
        }
    }

    Arrays.sort(arr) { o1, o2 -> 
        if (o1.second == o2.second) o1.first.compareTo(o2.first) 
        else o1.second.compareTo(o2.second)
    }

    return arr[k - 1].first
}
}