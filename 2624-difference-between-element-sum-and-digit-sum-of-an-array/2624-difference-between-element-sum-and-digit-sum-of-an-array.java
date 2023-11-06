class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int digitSum = 0;

        for (int num : nums) {
            sum += num;
            for (char c : String.valueOf(num).toCharArray()) digitSum += (c - '0');
        }

        return sum - digitSum;
    }
}