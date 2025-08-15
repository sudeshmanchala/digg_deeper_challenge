class Solution {
    public int countPrimes(int n) {
        if(n==0 ||n==1){
            return 0;
        }
        boolean[] table=new boolean[n+1];
        //table[2]=true;

        Arrays.fill(table,true);
        for(int i=2;i*i<=n;i++){
            if(table[i]){
                for(int j=i*2;j<n+1;j=j+i){
                    table[j]=false;
                }

            }
        }
        int c=0;
        for(int i=2;i<n;i++){
            if(table[i]){
                c++;
            }
        }
        return c;
    }
}
