class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();

        if (digits.length() == 0) {
            return ans;
        }

        String[] phone = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        backtrack(0, digits, phone, new StringBuilder(), ans);

        return ans;
    }

    private void backtrack(int index, String digits, String[] phone,
                           StringBuilder current, List<String> ans) {

        // Base case
        if (index == digits.length()) {
            ans.add(current.toString());
            return;
        }

        String letters = phone[digits.charAt(index) - '0'];

        for (char ch : letters.toCharArray()) {
            current.append(ch);

            backtrack(index + 1, digits, phone, current, ans);

            current.deleteCharAt(current.length() - 1);
        }
    }
}