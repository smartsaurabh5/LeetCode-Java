import java.util.*;

class Solution {

    public int minAbsDifference(int[] nums, int goal) {

        int n = nums.length;

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        generate(nums, 0, n / 2, 0, left);
        generate(nums, n / 2, n, 0, right);

        Collections.sort(right);

        int ans = Math.abs(goal);

        for (int sum : left) {

            int target = goal - sum;

            int low = 0;
            int high = right.size() - 1;

            while (low <= high) {

                int mid = low + (high - low) / 2;

                int total = sum + right.get(mid);

                ans = Math.min(ans,
                        Math.abs(goal - total));

                if (total == goal) {
                    return 0;
                }

                if (total < goal) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return ans;
    }

    static void generate(int[] nums, int start,
                         int end, int sum,
                         List<Integer> list) {

        if (start == end) {
            list.add(sum);
            return;
        }

        generate(nums, start + 1, end,
                 sum, list);

        generate(nums, start + 1, end,
                 sum + nums[start], list);
    }
}