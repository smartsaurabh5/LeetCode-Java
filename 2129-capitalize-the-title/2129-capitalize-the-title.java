class Solution {
    public String capitalizeTitle(String title) {
        char[] ch = title.toCharArray();
        int start=0;
        for(int i =0;i<=ch.length;i++){
            if(i==ch.length || ch[i]==' '){
                if(i-start==1){
                   ch[start]=Character.toLowerCase(ch[start]);
                }
                else if(i-start==2){
                    ch[start]=Character.toLowerCase(ch[start]);
                    ch[i-1]=Character.toLowerCase(ch[i-1]);
                }
                else{
                    ch[start]=Character.toUpperCase(ch[start]);
                    for(int j =start+1;j<i;j++){
                        ch[j]=Character.toLowerCase(ch[j]);
                    }
                }
                    start=i+1;
            }
        }
           return new String(ch);
    }
}