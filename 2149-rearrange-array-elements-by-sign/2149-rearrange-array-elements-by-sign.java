class Solution {
    public int[] rearrangeArray(int[] nums) {

        int[] arr = new int[nums.length];
        int[] nums1 = new int[nums.length / 2]; // Negative
        int[] nums2 = new int[nums.length / 2]; // Positive

        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                nums1[index1++] = nums[i];
            } else {
                nums2[index2++] = nums[i];
            }
        }

        int index3 = 0;
        int index4 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                arr[i] = nums2[index3++]; // Positive
            } else {
                arr[i] = nums1[index4++]; // Negative
            }
        }

        return arr;
    }
}