class Solution {
    public int[] validSequence(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        // suf[i] = number of characters of word2
        // that can be matched exactly using word1[i...]
        int[] suf = new int[n + 1];

        int j = m - 1;

        for (int i = n - 1; i >= 0; i--) {
            suf[i] = suf[i + 1];

            if (j >= 0 && word1.charAt(i) == word2.charAt(j)) {
                suf[i]++;
                j--;
            }
        }

        int[] ans = new int[m];

        int i = 0;
        j = 0;
        boolean changed = false;

        while (j < m && i < n) {

            // Exact match
            if (word1.charAt(i) == word2.charAt(j)) {
                ans[j] = i;
                i++;
                j++;
            }

            // Use our one allowed mismatch
            else if (!changed && suf[i + 1] >= m - j - 1) {
                ans[j] = i;
                i++;
                j++;
                changed = true;
            }

            else {
                i++;
            }
        }

        // Could not form valid sequence
        if (j != m) {
            return new int[0];
        }

        return ans;
    }
}