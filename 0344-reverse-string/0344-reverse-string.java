class Solution {
    public void reverseString(char[] s) {
        int low =0;
        int high = s.length-1;
        while(low<high){
            char temp=s[low];
            s[low]=s[high];
            s[high]=temp;
            low++;
            high--;
        }
    }
}///it is optmized solution but we can do it by recursion also ...but recurion specae comlexity is different ...but in question it give complexity should be 0(1);