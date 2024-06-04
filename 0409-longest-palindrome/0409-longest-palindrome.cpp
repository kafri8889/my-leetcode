class Solution {
public:
	int longestPalindrome(std::string s) {
		std::map<char, int> map;
		int panjang = 0;

		for (char c : s) {
			if (map.find(c) != map.end()) map[c] = map[c] + 1;
			else map[c] = 1;
		}

		for (std::pair<const char, int> entry : map) {
			panjang += (entry.second / 2) * 2;
			if((entry.second % 2) == 1 && (panjang % 2) == 0) panjang++;
		}

		return panjang;
	}
};