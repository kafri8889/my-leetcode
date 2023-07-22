class Solution {
public:
int addDigits(int num) {
    int sum;
    string str = to_string(num);

    while (true) {
        for (const auto &item: str) sum += stoi(string(1, item));
        str = to_string(sum);
        if (str.size() == 1) break;

        sum = 0;
    }

    return stoi(str);
}
};