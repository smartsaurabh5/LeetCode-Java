class Solution {
    public int findDuplicate(int[] nums) {
       int[] frequency = new int[nums.length];
       for(int num:nums){
        frequency[num]++;
        if(frequency[num]>1){
            return num;
        }
       }
       return -1;
    }
}