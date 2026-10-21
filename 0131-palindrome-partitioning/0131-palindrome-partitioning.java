class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans= new ArrayList<>();
        List<String> path = new ArrayList<>();
        int index =0;
        int n = s.length();
        printsubstring(s,index,ans,path,n);
        return ans;
    }
    static void printsubstring(String s,int index, List<List<String>> ans,List<String> path,int n){
        if(index==n){
        ans.add(new ArrayList<>(path));
        return;
        }
        for(int i =index;i<s.length();i++){
            if(ispalindrone(s,index,i)){
                path.add(s.substring(index,i+1));
                printsubstring(s,i+1,ans,path,n);
                path.remove(path.size()-1);
            }
        }
    }
    static boolean ispalindrone(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}