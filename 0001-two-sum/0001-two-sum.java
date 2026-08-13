class Solution {
    public int[] twoSum(int[] nums, int target) {
    HashMap<Integer,Integer> number =new HashMap<>();
    for(int j =0;j<nums.length;j++){
        int n = nums[j];
        int moreneeded=target-n;
        if(number.containsKey(moreneeded)){
            return new int[]{j,number.get(moreneeded)}
        }
        else{
            number.put(nums[j],j);
        }
    }
    return new int[]{-1,-1};
    }
}
