// class Solution {
//     static int maximumamount(List<Integer> temp){
//         int prev=temp.get(0);
//         int prev2=0;
//         for(int i =1;i<temp.size();i++){
//             int pickfirst=temp.get(i);
//             if(i>1){
//                 pickfirst+=prev2;
//             }
//             int notpick=0+prev;
//             int curri=Math.max(pickfirst,notpick);
//             prev2=prev;
//             prev=curri;
//         }
//         return prev;
//     }
//     public int rob(int[] nums) {
//         int n=nums.length;
//         if(n==1){
//             return nums[0];
//         }
//         List<Integer> temp1=new ArrayList<>();
//         List<Integer> temp2=new ArrayList<>();
//         for(int i =0;i<n;i++){
//             if(i!=0)temp1.add(nums[i]);
//             if(i!=n-1)temp2.add(nums[i]);
//         }
//         return Math.max(maximumamount(temp1),maximumamount(temp2));
//     }
// }
class Solution {
    static int maximumamount(int arr[],int start,int end){
        int prev=0;
        int prev2=0;

        for(int i =start;i<=end;i++){
            int pickfirst=arr[i];
            if(i>1){
                pickfirst+=prev2;
            }
            int notpick=0+prev;
            int curri=Math.max(pickfirst,notpick);
            prev2=prev;
            prev=curri;
        }
        return prev;
    }
    public int rob(int[] nums) {
        int n=nums.length;
           if(n==1){
            return nums[0];
           }
       
        return Math.max(maximumamount(nums,1,n-1),maximumamount(nums,0,n-2));
    }
}