class Solution {
    public int constrainedSubsetSum(int[] nums, int k) {

        int n = nums.length;
        int dp[] = new int[n];

        Deque<Integer> dq = new ArrayDeque<>();

        int ans = nums[0];

        for (int i = 0; i < n; i++) {

            // Remove indices outside the window
            while (!dq.isEmpty() && dq.peekFirst() < i - k) {
                dq.pollFirst();
            }

            // Calculate DP
            dp[i] = nums[i];

            if (!dq.isEmpty()) {
                dp[i] += Math.max(0, dp[dq.peekFirst()]);
            }

            ans = Math.max(ans, dp[i]);

            // Maintain decreasing DP values
            while (!dq.isEmpty() &&
                   dp[dq.peekLast()] <= dp[i]) {
                dq.pollLast();
            }

            dq.offerLast(i);
        }

        return ans;
    }
}