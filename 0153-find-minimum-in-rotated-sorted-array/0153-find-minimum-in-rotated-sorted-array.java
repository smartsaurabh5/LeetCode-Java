class Solution {
    public int findMin(int[] nums) {
      int left =0;
      int right = nums.length-1;

      while(left<right){
        int mid = left+(right-left)/2;
        if(nums[mid]>nums[right]){
            //iska mtlb h ki minimum aabhi right side me hi lie kr rha haii to kyuki array rotated and sorted haaiii;to left ko mid +1; kr denge aaur agr chotaa hua right se mtlb ki left me hi lie kr rha ....to right ko mid ke brabar ke denge kyuki agr chota haii mtlb kya pta whin number sbse chota ho isliye whi se start ke rhe aab dekhna h ussse chota kaunsa h ;
            left = mid+1;
        }
        else{
            right =mid;
        }
      }
      return nums[left];//jarruri nhi h ki left hi waps kre ...koi sa bhi kr skte h kyuki at the end dono left and right ek ko hi point karenge ;
    }
}