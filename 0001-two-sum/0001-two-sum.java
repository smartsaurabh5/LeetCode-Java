class Solution {
    public int[] twoSum(int[] nums, int target) {
    HashMap<Integer,Integer> number =new HashMap<>();
    for(int i =0;i<nums.length;i++){
        int n = nums[i];
        int moreneeded=target-n;
        if(number.containsKey(moreneeded)){
            return new int[]{i,number.get(moreneeded)};
        }
        else{
            number.put(nums[i],i);
        }
    }
    return new int[]{-1,-1};
    }
}
