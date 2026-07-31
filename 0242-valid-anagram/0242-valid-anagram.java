class Solution {
    public boolean isAnagram(String s, String t) {
     char[] arr= s.toCharArray();
     char[] arr1 =t.toCharArray();
     Arrays.sort(arr);
     Arrays.sort(arr1);
     String sorted = new String(arr);
     String sorted1 = new String(arr1);
    return sorted.equals(sorted1);

    }
}///this is basically brute force we cant able to  use sort in string so firstly need to covert into char array and then sort and again convert it into string to use .euqals because cant use in array ...the retunr ye if both string equals otherwise retunr false;