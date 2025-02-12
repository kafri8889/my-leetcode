class Solution {
    public int countPartitions(int[] nums) {
        int sumRight = 0;
        int sumLeft = 0;
        int result = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j <= i; j++) sumLeft += nums[j];
            for (int j = i + 1; j < nums.length; j++) sumRight += nums[j];

            if ((sumLeft - sumRight) % 2 == 0) result++;

            sumLeft = 0;
            sumRight = 0;
        }

        return result;
    }
}