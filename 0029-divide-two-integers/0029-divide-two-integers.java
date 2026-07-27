class Solution {
    public int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);

        int ans = 0;

        while (dvd >= dvs) {
            long temp = dvs;
            int mul = 1;

            while ((temp << 1) <= dvd) {
                temp <<= 1;
                mul <<= 1;
            }

            dvd -= temp;
            ans += mul;
        }

        return ((dividend < 0) ^ (divisor < 0)) ? -ans : ans;
    }
}