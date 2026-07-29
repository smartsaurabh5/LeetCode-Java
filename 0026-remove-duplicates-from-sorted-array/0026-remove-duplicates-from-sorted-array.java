class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;//iska piche ka concept haiii 2 pointer ek 0 se start hoga dusra ek se compare hoga jaise hi different mila  j ko ek bdha do aaur num[j] me daal do simple toh pehla element humesa unique hoga maan lo jaise nums[1] different hua nums[0] se mtlb j se waise hi j ko 1 se bdhao aaur value usme daal do....aaur j se 0 se start ho rha toh +1 krke waps krenge ;
        if(nums.length==0)return 0;
        for(int i =1;i<nums.length;i++){
            if(nums[i]!=nums[j]){
                j++;
                nums[j]=nums[i];
            }
        }
        return j+1;
    }
}
