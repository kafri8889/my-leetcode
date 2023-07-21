class Solution {
public:
int countMatches(vector<vector<string>>& items, string ruleKey, string ruleValue) {
    int count = 0;
    for (const auto &item: items) {
        if (
                (ruleKey == "type" && ruleValue == item[0]) ||
                (ruleKey == "color" && ruleValue == item[1]) ||
                (ruleKey == "name" && ruleValue == item[2])
        ) count++;
    }
    return count;
}
};