class Solution {
    static int f(int n,int[] arr){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(arr[n]>=0){
            return arr[n];
        }
        arr[n]=f(n-1,arr)+f(n-2,arr);
        return arr[n];
    }
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int[] arr=new int[n+1];
        Arrays.fill(arr,-1);
        arr[0]=0;
        arr[1]=1;
        return f(n,arr);
    }
}
