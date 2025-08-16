class Solution {
    public boolean just(int chk){
        if(chk==1||chk==3||chk==5||chk==7||chk==9){
            return true;
        }
        return false;
    }
    public String largestOddNumber(String num) {
       
        for(int i=num.length()-1;i>=0;i--){
            int chk=num.charAt(i)-'0';
           // System.out.println(chk);
            if(just(chk)){
                String ans=num.substring(0,i+1);
                return ans;
            }
        }
        return "";
    }
}
