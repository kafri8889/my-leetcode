class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> result = new ArrayList<>();

        outerLoop:
        for (int num = left; num <= right; num++) {
            int n = num;

            while (n > 0) {
                if (n % 10 == 0 || num % (n % 10) != 0) continue outerLoop;
                n /= 10;
            }

            result.add(num);
        }

        return result;
    }
}