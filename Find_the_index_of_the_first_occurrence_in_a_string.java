class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()>haystack.length() || needle.length()==0){
            return -1;
        }
        int j=0;
        boolean ans=false;
       while(j<(haystack.length()-needle.length())+1){
        int k=j;
        for(int i=0;i<needle.length();i++){
            if(haystack.charAt(k)!=needle.charAt(i)){
                break;
            }
            else{
                k++;
            }
           
        }
        if(k-j==(needle.length())){
            return j;
         }
        j++;
       }
       return -1;
    }
}
