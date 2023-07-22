class Solution {
public:
string maxString(vector<string>& strs) {
    string max;
    for (const auto &item: strs) max = item.size() > max.size() ? item : max;
    return max;
}

string longestCommonPrefix(vector<string>& strs) {
    bool diff;
    string pref;
    string currentC;
    int similarity;

    string max = maxString(strs);

    for (int i = 0; i < max.size(); ++i) {
        for (const auto &item: strs) {
            if (currentC.empty()) currentC = item[i];

            try {
                if (string(1, item.at(i)) == currentC) similarity++;
            } catch (out_of_range e) {}
        }
        if (similarity < strs.size()) break;
        
        pref += currentC;
        similarity = 0;
        currentC = "";
    }

    return pref;
}
};