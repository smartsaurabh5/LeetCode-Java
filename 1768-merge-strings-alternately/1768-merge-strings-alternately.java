class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i =0;
        int j =0;
         while(i<word1.length() && j<word2.length()){
            sb.append(word1.charAt(i++));//i++;
            sb.append(word2.charAt(j++));//j++;
         }
         while(i<word1.length()){
            sb.append(word1.charAt(i++));//i++;
         }
         while(j<word2.length()){
            sb.append(word2.charAt(j++));//j++;
         }
         return sb.toString();
    }
}//isme kuch tgda concept ni haii h..kya krna h ek stringbuilder bnaya uske baad jb tk i aaur j word1 aaur word2 ke length se km reh tbb tk ..phle word1 wale ko append kr do uske  baad ..word2 ko append kr do;then ..jaise hi koi ek khtm hua ..to ya toh i bach jaiyega ya fir j bch jayega toh jo bcha rahega uss while me ghus jaiyega aaur add kr dega sbb uska bcha hua ;;