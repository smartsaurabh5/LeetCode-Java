class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int n2:arr){
        if(set.contains(n2*2)||(n2%2==0 && set.contains(n2/2))){
            return true;
        }
        set.add(n2);
        }
        return false;
    }
}