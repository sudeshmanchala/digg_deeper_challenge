class Solution {
    public String simplifyPath(String path) {
       //String path="/home/user/Documents/../Pictures";
        Stack<String>st=new Stack<>();
        String ans[]=path.split("/"); // /.../b/d  /home/user/Pictures
        for(String i:ans){
            if(!i.equals("") && !i.equals(".")){
                if(!i.equals("..")){
                st.push(i);
                }
                else{
                    if(!st.isEmpty()){
                    st.pop();
                    }
                }
            }

        }
        ArrayList<String>arr=new ArrayList<>();
        while(!st.isEmpty()){
            arr.add(st.peek());
            st.pop();
        }
       // String reversed = new StringBuilder(q).reverse().toString();
       String q="/";
       for(int j=arr.size()-1;j>=0;j--){
           if(j!=0){
            q=q+arr.get(j);
            q=q+"/";
           }
           else{
               q=q+arr.get(j);
           }
       }
       return q;
    }
}
