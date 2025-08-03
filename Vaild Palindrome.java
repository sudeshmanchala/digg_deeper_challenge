class Solution {
    public boolean isPalindrome(String s) {
        String n=s.toLowerCase();
        String res="";
        for(int i=0;i<n.length();i++){
            if((n.charAt(i)>='a' && n.charAt(i)<='z') || (n.charAt(i)>='A' && n.charAt(i)<='Z') || (n.charAt(i)>='0' && n.charAt(i)<='9')){
                res=res+n.charAt(i);
            }
        }

        int i=0;
        int j=res.length()-1;
        while(i<j){
            if(res.charAt(i)!=res.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
