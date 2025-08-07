class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        int max=Integer.MIN_VALUE;
        int ans;
        HashSet<Character>hs=new HashSet<>();
        ArrayDeque<Character>q=new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
           if(!hs.contains(c)){
            q.add(c);
            hs.add(c);
            ans=q.size();
            if(ans>max){
                max=ans;
            }
           }
           else{
                while(q.peek()!=s.charAt(i)){
                    hs.remove(q.peek());
                    q.poll();

                } 
                q.poll();
                q.add(s.charAt(i));
           }

        }
        return max;
    }
}
