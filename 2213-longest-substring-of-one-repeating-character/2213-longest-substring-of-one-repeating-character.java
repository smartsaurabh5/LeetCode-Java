class Solution {
    class Node {
        int len, pref, suff, best;
        char leftChar, rightChar;
    }

    Node[] tree;
    char[] arr;

    public int[] longestRepeating(String s, String queryCharacters, int[] queryIndices) {
        int n = s.length();
        arr = s.toCharArray();
        tree = new Node[4 * n];

        build(1, 0, n - 1);

        int q = queryIndices.length;
        int[] ans = new int[q];

        for (int i = 0; i < q; i++) {
            update(1, 0, n - 1, queryIndices[i], queryCharacters.charAt(i));
            ans[i] = tree[1].best;
        }

        return ans;
    }

    private void build(int idx, int l, int r) {
        tree[idx] = new Node();

        if (l == r) {
            tree[idx].len = tree[idx].pref = tree[idx].suff = tree[idx].best = 1;
            tree[idx].leftChar = tree[idx].rightChar = arr[l];
            return;
        }

        int mid = (l + r) / 2;
        build(idx * 2, l, mid);
        build(idx * 2 + 1, mid + 1, r);
        pull(idx);
    }

    private void update(int idx, int l, int r, int pos, char ch) {
        if (l == r) {
            arr[pos] = ch;
            tree[idx].leftChar = tree[idx].rightChar = ch;
            return;
        }

        int mid = (l + r) / 2;

        if (pos <= mid) {
            update(idx * 2, l, mid, pos, ch);
        } else {
            update(idx * 2 + 1, mid + 1, r, pos, ch);
        }

        pull(idx);
    }

    private void pull(int idx) {
        Node a = tree[idx * 2];
        Node b = tree[idx * 2 + 1];
        Node c = tree[idx];

        c.len = a.len + b.len;
        c.leftChar = a.leftChar;
        c.rightChar = b.rightChar;

        c.pref = a.pref;
        if (a.pref == a.len && a.rightChar == b.leftChar) {
            c.pref = a.len + b.pref;
        }

        c.suff = b.suff;
        if (b.suff == b.len && a.rightChar == b.leftChar) {
            c.suff = b.len + a.suff;
        }

        c.best = Math.max(a.best, b.best);
        if (a.rightChar == b.leftChar) {
            c.best = Math.max(c.best, a.suff + b.pref);
        }
    }
}