class Solution {
    public boolean isPowerOfTwo(int n) {
   return n>0 && (n & (n-1))==0;
   //ek baat jaan lo 2 power wale jitne bhi number hote h sbki binary me kewal ek hi bit 1 hoti haii baki sb zero hota h..to jaise hi uska n-1 wali digit se and lete h to vo zero ho jata haii ...means rightmost digit remove ho jati haii ...aaur kisi bhi binary me se 1 minus krna ka niyam hota haii ..right se khojo jha phla one mile usse zero bna do aaur right most wali sari value ko 1 bna do ...isliye n-1 krne ke baad dono ki binary me and le rhe toh zero ho ja rha ...aaaur ye return true tbhi krege jb dono contion shi hogi baki false karega;
    }
}