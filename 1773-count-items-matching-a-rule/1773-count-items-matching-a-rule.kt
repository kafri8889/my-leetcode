class Solution {
    fun countMatches(items: List<List<String>>, ruleKey: String, ruleValue: String): Int {
        return items.filter { when (ruleKey) {
            "color" -> it[1] == ruleValue
            "type" -> it[0] == ruleValue
            "name" -> it[2] == ruleValue
            else -> false
        } }.size
    }
}