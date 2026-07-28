class Solution {
    public void moveZeroes(int[] nums) {
        int j =0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp = nums[i];///kuch ni krna jo bhi dusra value mile  o ke alawa sidha j se swap kr do aaaur aaur j ki value bdha do ek se...aage chlke pura value aage aa jaiyegi last me bch jaiyeg abs zero
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
    }
}