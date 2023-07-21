class Solution {
public:
int distinctAverages(vector<int>& nums) {
    vector<float> res;
    vector<int> mnums;

    mnums.insert(mnums.end(), nums.begin(), nums.end());

    while (!mnums.empty()) {
        int max = *max_element(mnums.begin(), mnums.end());
        int min = *min_element(mnums.begin(), mnums.end());
        float avg = (static_cast<float>(max) + static_cast<float>(min)) / 2;
        if (find(res.begin(), res.end(), avg) == res.end()) res.push_back(avg);
        mnums.erase(max_element(mnums.begin(), mnums.end()));
        mnums.erase(min_element(mnums.begin(), mnums.end()));
    }

    return res.size();
}
};