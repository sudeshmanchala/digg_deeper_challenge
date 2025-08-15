class Solution {
    public static class pair{
        char ch;
        int c;
        pair(char ch, int c){
            this.ch=ch;
            this.c=c;
        }
    }
    public String removeDuplicates(String s, int k) {
        Stack<pair>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char q=s.charAt(i);
            if(!st.isEmpty() && st.peek().ch==q){
                st.peek().c=st.peek().c+1;
                if(st.peek().c==k){
                    st.pop();
                }
            }
            else{
                st.add(new pair(q,1));
            }
        }
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty()){
            for(int j=st.peek().c;j>0;j--){
            ans.append(st.peek().ch);
            }
            st.pop();
        }
        return ans.reverse().toString();
    }
}
