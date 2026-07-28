class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
      int n = nums.length;
      Arrays.sort(nums);
      List<List<Integer>> list = new ArrayList<>();

      for(int i =0;i<n;i++){
        if(i>0 && nums[i]==nums[i-1])continue;//taki i same na ho 
    
        for(int j =i+1;j<n;j++){
        if(j>i+1 && nums[j]==nums[j-1])continue;//taki j same na ho;

        int k =j+1; //k aaur l move karega humesh;
        int l=n-1;

         while(k<l){

             long sum = (long)nums[i]+nums[j]+nums[k]+nums[l];//(long) isliye lga h ki dhyana dena.. jo calculation ho rhi vo vo integer ki ho rhi hai toh answer bhi integer me hoga simple to aagr ussi samay soverflow ho gya toh game khtm to long lga diya phle toh sari value long bn jaiyegi jisse overflow ka risk ni hoga

            if(sum==target){
              list.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));//list me add krne ke liye Arrays.asList use karenge dhyan rkhna

              k++; //ek bdha denge k ko lekin ek bdhane ke mtlb h next value chahiye niche while loop lga h usssi ke liye ki next value mile ;
              l--;//ek ghta denge taki l ki next value mile same nhi niche while isiliye likha haiii;

              while(k<l && nums[k]==nums[k-1]){
                k++;
                }

              while(k<l && nums[l]==nums[l+1]){
                l--;
                }
            }

            else if(sum<target){ //sum agr target se km haii mtlb k ki value bdhayenge kyuki array sorted h ...l ko ghtaiyenge to value aaur km hogi
                k++;
            }

            else{
                l--;
            }
         }
        }
      }
      return list;///retunr kr diya addd kr ke so simple;
    }
}