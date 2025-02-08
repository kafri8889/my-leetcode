class Solution {
    public boolean canAliceWin(int[] nums) {
        int singleDigit = 0;
        int doubleDigit = 0;

        for (int num : nums) {
            int n = num;
            int sum = 0;
            boolean isSingle = true;

            while (n > 0) {
                sum += n % 10;
                n /= 10;

                if (n > 0) {
                    isSingle = false;
                }
            }

            if (isSingle) singleDigit += num;
            else doubleDigit += num;
        }

        if (singleDigit > doubleDigit || doubleDigit > singleDigit) return true;
        else return false;
    }
}