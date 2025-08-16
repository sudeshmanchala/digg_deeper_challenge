class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int c=0;
        int one=0;
        int two=0;
        while(one!=g.length && two!=s.length){
            //if(two==s.length || one==g.length)
            if(s[two]>=g[one]){
                c=c+1;
                one++;
                two++;
            }
            else{
                two++;
            }
            
        }
        return c;
    }
}
