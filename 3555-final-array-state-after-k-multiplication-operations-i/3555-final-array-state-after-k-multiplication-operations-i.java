class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int minVal = Integer.MAX_VALUE;
        int index = -1;

        for (int i = 0; i < k; i++) {
            System.out.println(Arrays.toString(nums));
            for (int j = 0; j < nums.length; j++) if (nums[j] < minVal) {
                minVal = nums[j];
                index = j;
            }

            nums[index] = nums[index] * multiplier;
            minVal = Integer.MAX_VALUE;
            index = -1;
        }

        return nums;
    }
}