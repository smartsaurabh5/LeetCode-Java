class Solution {
    public int singleNumber(int[] nums) {
     int ans=0;
     for(int i =0;i<nums.length;i++){
        ans=ans^nums[i];
     }
     return ans;
    }
}//tughe concept smjhata hu xor ke pass associate property aaur commutative property hoti toh aaru tu janta h same value ka xor krne pe 0 aa jata h ...to ye mt soch ki yha fir sum krte ja rhe kya ki akhiri me sbka zero ho gya aaur single bch gya ..aaisha nhi h..yha pe kya kr rhe ki associative property toh maanle ye h  a^b^c^a^b^c ....toh iska answer aana zero hi haii ...chahe a^b krke fir ^a lo toh bhi aaiyega ya fir a^a krke ^b lo to bhi b hi aaiyegi means vo adjust automatically ho jaiyega aagr sbb even digit times aaye h aaaur koi number bs ek baar aaya h simple...(xor ki commutataive aaaur asssociative property yaad kr lena smjh me aa jaiyega)