class Solution {
public:
bool isHappy(int n) {
    int sum = 0;
    string str = to_string(n);

    while (true) {
        for (const auto &item: str) sum += pow(stoi(string(1, item)), 2);
        if (sum == 4) break;
        if (sum == 1) return true;

        str = to_string(sum);
        sum = 0;
    }

    return false;
}
};