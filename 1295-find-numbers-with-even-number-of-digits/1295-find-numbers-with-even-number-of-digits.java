class Solution {
    public int findNumbers(int[] nums) {
        int odd=0;
     for (int i =0;i<nums.length;i++){
        int count =0;
        int temp = nums[i];
        while(temp>0){
          temp/=10;
          count++;
        }
        if(count%2==0){
         odd++;
        }
     }  
     return odd; 
    }
}