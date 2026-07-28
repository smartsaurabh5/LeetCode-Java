class Solution {
    public int threeSumClosest(int[] nums, int target) {
    int n= nums.length;
    Arrays.sort(nums);///sort krna jarruri haii;
    int closet = nums[0]+nums[1]+nums[2];

    for(int i =0;i<n-2;i++){////confusion ek hoga jaise 3 vaule chahiye toh i ki value n-2 se jyada chlane ka koi mtlb ni bnegea kyuki do value hi nhi bachegi aaaur 3 sum aaur 4 sum ke concept me while use tha same value na use ho baar baar ..kyuki triplet alg chahiye the wha pe indices se koi mtlb ni tha ...value different chahiye the ..but yha pe vlaue same chalegi bs indices(index) different honi chhaiye ;
        int j =i+1;
        int k=n-1;

        while(j<k){
            int sum = nums[i]+nums[j]+nums[k];
            if(Math.abs(sum-target)<Math.abs(closet-target)){//check kr rhe kaunsa jyada pass haii abs means absolute jo choti h mtlb jyada pass haii to closet me daal diya hu ;
                closet =sum;
            }

            if(sum<target){//sum agr target se chota haii toh j++ same whi 3 sum 4 sum wala concept 
               j++;
            }

            else if(sum>target){///bda haii toh k-- me kr do...
                k--;
            }

            else{
                return sum; //agr sum hi mil gya toh return kr denge sidha sum;
            }
        }
    }

   return closet;///akhiri me closet wali value ko return kr dunga,...

    }
}