class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> values;

    for (int k = 0; k < nums.size(); ++k) {
        int min = target - nums.at(k);
        auto mFind = find(values.begin(), values.end(), nums.at(k));
        if (mFind != values.end()) {
            int index = mFind - values.begin();
            return {index, k};
        }

        values.push_back(min);
    }

    return {};
    }
};