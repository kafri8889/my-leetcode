class Solution {
public:
int findNonMinOrMax(vector<int>& nums) {
    auto min = *min_element(nums.begin(), nums.end()), max = *max_element(nums.begin(), nums.end());

    nums.erase(remove(nums.begin(), nums.end(), min), nums.end());
    nums.erase(remove(nums.begin(), nums.end(), max), nums.end());

    try {
        return nums.at(0);
    } catch (out_of_range e) { return -1; }
}
};