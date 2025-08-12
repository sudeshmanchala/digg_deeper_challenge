class Solution {
    public static int chk(int n,int[] ways){
        if(ways[n]==-1){
            ways[n]=chk(n-2,ways)+chk(n-1,ways);
        }
        else{
            return ways[n];
        }
        return ways[n];
    }
    public int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        int[] ways=new int[n+1];
        Arrays.fill(ways,-1);
        ways[1]=1;
        ways[2]=2;
        return chk(n,ways);
    }
}
