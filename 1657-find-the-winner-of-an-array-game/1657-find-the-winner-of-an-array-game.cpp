class Solution {
public:
int getWinner(vector<int>& arr, int k) {
	if (k >= arr.size()) return *max_element(arr.begin(), arr.end());

	int totalWin = 0;
	int currentWinnerIndex = 0;
	int currentOpponentIndex = 1;

	loop:
	for (int i = 0; i < arr.size(); ++i) {
		if (arr[currentWinnerIndex] > arr[currentOpponentIndex]) {
			totalWin++;
			if (totalWin == k) return arr[currentWinnerIndex];
			currentOpponentIndex++;
		} else {
			totalWin = 1;
			currentWinnerIndex = currentOpponentIndex;
			currentOpponentIndex++;
			if (totalWin == k) return arr[currentWinnerIndex];
		}

		if (currentOpponentIndex == arr.size()) {
			currentOpponentIndex = 0;
			goto loop;
		}
	}

	return -1;
}
};