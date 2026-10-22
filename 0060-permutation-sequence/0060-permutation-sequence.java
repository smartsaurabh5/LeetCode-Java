class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> numbers= new ArrayList<>();
        int fact =1;
        for(int i =1;i<n;i++){
            fact=fact*i; ////n-1 factorial le rhe kyuki agr n =4 haii total 24 permutation aayenge ...toh 1 se atart hone wale 6 combination and 2 se start hone wale 6 combonation ans continue so first array ki size 6 hogi joki hoti haii 3 factorial ke barabar for exampke = 1 +[2,3,4]ka comibnation ==6 ,2+[1,3,4]ka comibabtion ==6 ..to baar baar hum factorial ko update krte jaiyenge fact = fact/numbers.size();
            numbers.add(i);
        }
        numbers.add(n);
        String ans ="";
        k=k-1;
        while(true){
            ans= ans+numbers.get(k/fact);
            numbers.remove(k/fact);
            if(numbers.size()==0){
                break;
            }
            k=k%fact;
            fact = fact/numbers.size();
        }
        return ans;
    }
}