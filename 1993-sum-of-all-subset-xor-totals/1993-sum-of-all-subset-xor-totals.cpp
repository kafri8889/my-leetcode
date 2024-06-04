class Solution {
private:
	void findSubset(const std::vector<int>& vector,int index,std::vector<int>& currentSubset,std::vector<std::vector<int>>& dest) {
		if (index == vector.size()) {
			dest.push_back(currentSubset);
			return;
		}

		// Include current element
		currentSubset.push_back(vector[index]);
		findSubset(vector, index + 1, currentSubset, dest);

		// Exclude current element
		currentSubset.pop_back();
		findSubset(vector, index + 1, currentSubset, dest);
	}
public:

	int subsetXORSum(std::vector<int> nums) {
		int sum = 0;
		std::vector<std::vector<int>> subsets;
		std::vector<int> currentSubset;

		findSubset(nums, 0, currentSubset, subsets);

		for (const auto subset : subsets) {
			if (subset.empty()) continue;

			int mxor = subset[0];
			for (int i = 1; i < subset.size(); ++i) mxor = mxor xor subset[i];
			sum += mxor;
		}

		return sum;
	}
};