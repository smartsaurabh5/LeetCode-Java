class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {

        int s = triangle.size();

        int dp[][] = new int[s][s];
        boolean visited[][] = new boolean[s][s];

        return minimumpathsum(0, 0, s-1, triangle, dp, visited);
    }

    static int minimumpathsum(int m, int n, int s,
                              List<List<Integer>> triangle,
                              int dp[][], boolean visited[][]) {

        if (m == s) {
            return triangle.get(m).get(n);
        }

        if (visited[m][n]) {
            return dp[m][n];
        }

        int down = triangle.get(m).get(n) +
            minimumpathsum(m+1, n, s, triangle, dp, visited);

        int diagonal = triangle.get(m).get(n) +
            minimumpathsum(m+1, n+1, s, triangle, dp, visited);

        visited[m][n] = true;

        return dp[m][n] = Math.min(down, diagonal);
    }
}