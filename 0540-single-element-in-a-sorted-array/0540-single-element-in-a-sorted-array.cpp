class Solution {
public:
    int singleNonDuplicate(vector<int>& nums) {
        if (nums.size() <= 1) return nums[0];
        
        for (int i = 0; i < nums.size(); ++i) {
            if (nums[i] == nums[i + 1]) i += 1;
            else return nums[i];
        }

        return -1;
    }
};