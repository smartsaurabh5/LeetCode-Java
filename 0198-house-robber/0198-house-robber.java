// spcae optimization----------------
// class Solution {
//     public int rob(int[] nums) {
//         int prev2 = 0;  // dp[i-2]
//         int prev1 = 0;  // dp[i-1]
        
//         for(int num : nums){
//             int current = Math.max(prev1, prev2 + num);
//             prev2 = prev1;
//             prev1 = current;
//         }
        
//         return prev1;
//     }
// }
//memoization-----------------------
// class Solution {
// public int rob(int[] nums) {
//   int n= nums.length-1;
//   int dp[]=new int[n+1];
//   Arrays.fill(dp,-1);
//   return(f(n,nums,dp));
// }
// static int f(int n ,int nums[],int[] dp){
//     if(n==0){
//         return nums[n];
//     }
//     if(n<0){
//         return 0;
//     }
//     if(dp[n]!=-1){
//         return dp[n];
//     }
//     int pick1sthome=nums[n]+ f(n-2,nums,dp);
//     int notpick1sthome=0+f(n-1,nums,dp);
//     return dp[n]=Math.max(pick1sthome,notpick1sthome);
// }
// }
// tabulation-----------------------------------------------------
class Solution {
public int rob(int[] nums) {
  int n= nums.length-1;
  return(f(n,nums));
}
static int f(int n ,int nums[]){
    if(n==0){
        return nums[n];
    }
    if(n<0){
        return 0;
    }
    int dp[]= new int[n+1];
    dp[0]=nums[0];
    for(int i =1;i<=n;i++){
    int pick1sthome=nums[i];
        if(i>1){
        pick1sthome=nums[i]+ dp[i-2];
        }
    int notpick1sthome=0+dp[i-1];
    dp[i]=Math.max(pick1sthome,notpick1sthome);
    }
    return dp[n] ;
}
}