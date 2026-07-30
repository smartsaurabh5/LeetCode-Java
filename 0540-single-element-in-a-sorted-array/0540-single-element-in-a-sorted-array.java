class Solution {
    public int singleNonDuplicate(int[] nums) {
        int ans =0;
      for(int i =0;i<nums.length;i++){
        ans^=nums[i];
      }
      return ans;
    }
} //it is correct but the solution is just asking for 0(n) complexity;