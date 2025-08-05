class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==1){
            return s;
        }
        String ans="";
        for(int i=0;i<s.length();i++){
            for(int j=s.length();j>i;j--){
            int low=i;
            int high=j-1;
            int c=1;
            while(low<high){

                if(s.charAt(low)!=s.charAt(high)){
                    c=0;
                    break;
                }
                high--;
                low++;
                
            }
            if((ans.length()<(j-i) )&& c!=0){
                ans=s.substring(i,j);
            }
            
            }
            

        }
        return ans;
    }
}
