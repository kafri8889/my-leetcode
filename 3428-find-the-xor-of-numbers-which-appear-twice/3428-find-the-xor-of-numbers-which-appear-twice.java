class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        long mask = 0;
        int xor = 0;

        for (int n: nums) {
            if (((1L << n) & ~mask) != 0) mask |= (1L << n);
            else xor ^= n;
        }

        return xor;
    }
}