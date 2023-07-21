class Solution {
public:
int distinctAverages(vector<int>& nums) {
    vector<float> res;

    while (!nums.empty()) {
        int max = *max_element(nums.begin(), nums.end());
        int min = *min_element(nums.begin(), nums.end());
        float avg = (static_cast<float>(max) + static_cast<float>(min)) / 2;
        if (find(res.begin(), res.end(), avg) == res.end()) res.push_back(avg);
        nums.erase(max_element(nums.begin(), nums.end()));
        nums.erase(min_element(nums.begin(), nums.end()));
    }

    return res.size();
}
};