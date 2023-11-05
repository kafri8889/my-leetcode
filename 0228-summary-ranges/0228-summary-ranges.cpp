class Solution {
public:
vector<string> summaryRanges(vector<int>& nums) {
	if (nums.empty()) return {};
	if (nums.size() == 1) return {to_string(nums[0])};

	vector<string> ranges = {};
	int startNum = nums[0];
	bool range = false;

	for (int i = 0; i < nums.size(); i++) {
		if (i < nums.size() - 1) {
			if (nums[i] + 1 == nums.at(i + 1)) {
				range = true;
				continue;
			}
		}

		if (range) ranges.push_back(to_string(startNum) + "->" + to_string(nums[i]));
		else ranges.push_back(to_string(nums[i]));
		
		if (i < nums.size() - 1) {
			startNum = nums.at(i + 1);
			range = false;
		}
	}

	return ranges;
}
};