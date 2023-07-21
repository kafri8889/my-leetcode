class Solution {
public:
vector<int> leftSum(vector<int>& nums, vector<int> destination = {}) {
    for (int i = 0; i < nums.size(); ++i) {
        if (i == 0) { destination.push_back(0); continue; }
        destination.push_back(accumulate(nums.begin(), nums.begin() + i, 0));
    }

    return destination;
}

vector<int> rightSum(vector<int>& nums, vector<int> destination = {}) {
    for (int i = 0; i < nums.size(); ++i) {
        if (i == nums.size() - 1) { destination.push_back(0); continue; }
        destination.push_back(accumulate(nums.begin() + i + 1, nums.end(), 0));
    }

    return destination;
}

vector<int> leftRightDifference(vector<int>& nums) {
    vector<int> result;
    vector<int> left = leftSum(nums);
    vector<int> right = rightSum(nums);

    for (int i = 0; i < nums.size(); ++i) result.push_back(abs(left.at(i) - right.at(i)));

    return result;
}
};