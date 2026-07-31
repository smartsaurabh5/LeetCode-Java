class Solution {
    public boolean isAnagram(String s, String t) {
     int[] arr=new int[26];

     if(s.length()!=t.length())return false;

     for(int i =0;i<s.length();i++){
        arr[s.charAt(i)-'a']++;
        arr[t.charAt(i)-'a']--;
     }
     for(int count:arr){
        if(count!=0){
            return false;
        }
     }
     return true;
    }
}//isme kya kr rhe ...ek arr le le rhe 26 space ki kyuki alphabet 26 ki hoti haii ..anagram hone ke liye toh dono ka length brabar hona hi chahiye nhi toh khel whi khtm okh...uske baad ek loop liya usme kya kr rhe kisi bhi ek string ki length tk chalega uske..dono ki lenght brabr h kyuki uske baad main concept ye haii ki ...small start hota h 97 se ..toh pehli strin gke pehle character ko leke a me se ghta de rhe toh jo alphabet me uski position hoti h vo  mil ja rhi ...aaur uspe jake ++ kr de rhe ..then dusri wali string me aagr same word hoga to -- ho jaiyega ...to agr ek bhi alg mil toh hr 26 ki 26 jgh arr me 0 nhi hogaa to fir ek loop chla liya aagr khi bhi o ke alawa kuch mila retunr false otherwise return true;