class Solution {
public:
vector<int> plusOne(vector<int>& digits) {
	for (int i = digits.size() - 1; i >= 0; --i) {
		digits[i] = digits[i] + 1;

		if (digits[i] < 10) break;
		if (digits[i] > 9 && i == 0) {
			digits[i] = digits[i] - 10;
			digits.insert(digits.begin(), 1);
		} else digits[i] = digits[i] - 10;
	}

	return digits;
}
};