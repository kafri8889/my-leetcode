class Solution {
fun mergeSimilarItems(items1: Array<IntArray>, items2: Array<IntArray>): List<List<Int>> {
    val tab = Hashtable<Int, Int>()

    for (item in items1) {
        if (tab.containsKey(item[0])) tab[item[0]] = tab[item[0]]!! + item[1]
        else tab[item[0]] = item[1]
    }

    for (item in items2) {
        if (tab.containsKey(item[0])) tab[item[0]] = tab[item[0]]!! + item[1]
        else tab[item[0]] = item[1]
    }

    return arrayListOf<List<Int>>().apply {
        for ((value, weight) in tab) add(listOf(value, weight))
    }.sortedBy { it[0] }
}
}