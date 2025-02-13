class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n+1];

        for (int i = 0; i <= n; i++) {
            int oneCount = 0;
            for (int j = 31; j >= 0; j--) {
                int bit = (i >> j) & 1;
                if (bit == 1) oneCount++;
            }
            result[i] = oneCount;
        }

        return result;
    }
}