class Solution {
    public int minElement(int[] nums) {
        int[] minimumNums = new int[nums.length];
        int min = Integer.MAX_VALUE;

        for (int num : nums) {
            int n = num;
            int sum = 0;

            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }

            if (sum < min) min = sum;
        }

        return min;
    }
}