class Solution {
    public int[] searchRange(int[] nums, int target) {
      int first =firstnumber(nums,target);
      int last=lastnumber(nums ,target);
      return new int[]{first,last};

    }
    static int firstnumber(int nums[],int target){
     int left=0;
     int right = nums.length-1;
     int ans=-1;
     while(left<=right){
        int mid =left+(right-left)/2;
        if(nums[mid]==target){
            ans=mid;
            right =mid-1;
        }
        else if(nums[mid]>target){
            right=mid-1;
        }
        else{
            left = mid+1;
        }
     }
     return ans;
    }
     static int lastnumber(int nums[],int target){
        int left = 0;
        int right = nums.length-1;
        int ans=-1;
        while(left<=right){
            int mid =left+(right-left)/2;
            if(nums[mid]==target){
                ans =mid;
                left=mid+1;
            }
            else if(nums[mid]>target){
                 right = mid-1;
            }
            else{
                left =mid+1;
            }
        }
        return ans;
     }
}// simply ek binary search chalya simple element ke miln eke baad left me uski starting kha se haii ..then uske baad ek dusra function target milne ke baad right me kha jake khtm hua h,uska baad main function se dono function ko call kr diya aaur bula first and last me store krwa liya uska baad first and last ko ek new aaray me store kr diya .