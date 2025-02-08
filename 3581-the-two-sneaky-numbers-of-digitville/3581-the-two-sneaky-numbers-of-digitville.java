class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);

        Integer firstNum = null;
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1) {
                if ((nums[i] ^ nums[i+1]) == 0) {
                    if (firstNum == null) {
                        firstNum = nums[i];
                    } else {
                        return new int[]{firstNum, nums[i]};
                    }
                    i++;
                }
            }
        }

        return new int[]{};
    }
}