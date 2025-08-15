class Solution {
    public static boolean chk(Stack<Integer>st,int k){
        if(st.peek()<0 && k > 0){
            return true;
        }
        if(st.peek()<0 && k < 0){
            return true;
        }
        if(st.peek()>0 && k > 0){
            return true;
        }
        return false;
    }
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>st=new Stack<>();
        for(int i=0;i< asteroids.length;i++){
            if(st.isEmpty()){
                st.add(asteroids[i]);
                continue;
            }
            if(!st.isEmpty() && chk(st, asteroids[i])){
                st.add(asteroids[i]);
            }
            else{
                int g=0;
                int abso=Math.abs(asteroids[i]);
                while(!st.isEmpty() && st.peek()<=abso && st.peek()>0){
                    if(st.peek()==abso){
                        st.pop();
                        g=1;
                        break;
                    }
                    else{
                        st.pop();
                    }
                }
                if(g==1){
                    continue;
                }
                if(st.isEmpty()){
                    st.add(asteroids[i]);
                }
                else{
                    if(st.peek()<0){
                        st.add(asteroids[i]);
                    }
                }
            }
        }
        ArrayList<Integer>arr=new ArrayList<>();
        while(!st.isEmpty()){
            arr.add(st.pop());
        }
        Collections.reverse(arr);
        return arr.stream().mapToInt(i -> i).toArray();

    }
}
