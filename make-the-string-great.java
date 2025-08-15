class Solution {
    public String makeGood(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(st.isEmpty()){
                st.add(s.charAt(i));
            }
            else{
                if((s.charAt(i)-'A'==st.peek()-'a')||(s.charAt(i)-'a'==st.peek()-'A')){
                    st.pop();
                }
                else{
                    st.add(s.charAt(i));
                }
            }
        }
        StringBuilder ans=new StringBuilder();
        if(st.isEmpty()){
            return "";
        }
        while(!st.isEmpty()){
            ans=ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}
