class Solution {
    public int calculate(String s) {
        char op='+';
        int n=0;
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                n=(n*10)+(s.charAt(i)-'0');
            }
            if((!Character.isDigit(s.charAt(i)) && s.charAt(i) != ' ')|| i==s.length()-1){
                if(op=='+'){
                    st.push(n);
                }
                else if(op=='-'){
                    st.push(-1* n);
                }
                else if(op=='*'){
                    st.push(st.pop() * n);
                }
                else if(op=='/'){
                    st.push(st.pop() / n);
                }
                n=0;
                op=s.charAt(i);


            }
        }
        int sum=0;
        while(!st.isEmpty()){
            sum=sum+(st.pop());
        }
        return sum;
    }
}
