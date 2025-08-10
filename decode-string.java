class Solution {
    public String decodeString(String s) {
       Stack<Character> st = new Stack<>();
       // String s = "3[z]2[2[y]pq4[2[jk]e1[f]]]ef";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ']') {
             
                StringBuilder ans = new StringBuilder();
                while (!st.isEmpty() && st.peek() != '[') {
                    ans.append(st.pop());
                }
                st.pop(); 

              
                ans.reverse();

                
                int base = 1;
                int count = 0;
                while (!st.isEmpty() && Character.isDigit(st.peek())) {
                    count = (st.pop() - '0') * base + count;
                    base *= 10;
                }

                
                String strToPush = ans.toString();
                for (int k = 0; k < count; k++) {
                    for (int q = 0; q < strToPush.length(); q++) {
                        st.push(strToPush.charAt(q));
                    }
                }
            } else {
                st.push(s.charAt(i));
            }
        }
        StringBuilder sol = new StringBuilder();
        while (!st.isEmpty()) {
            sol.append(st.pop());
        }
        return sol.reverse().toString();
    }
}
