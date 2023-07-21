class Solution {
public:
bool isToeplitzMatrix(vector<vector<int>>& matrix) {
    if (matrix.size() == 1 && matrix[0].size() == 1) return true;
    for (int i = 0; i < matrix.size() - 1; i++) {
        for (int j = 0; j < matrix[i].size() - 1; j++) {
            if (matrix.at(i).at(j) != matrix.at(i+1).at(j+1)) return false;
        }
    }

    return true;
}
};