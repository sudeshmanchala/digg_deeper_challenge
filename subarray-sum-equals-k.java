class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(0,1);
        int c=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(hm.containsKey(sum-k)){
                c=c+hm.get(sum-k);
                
            }
            if(!hm.containsKey(sum)){
            hm.put(sum,1);
            }
            else{
                hm.put(sum,hm.get(sum)+1);
            }
        }
        return c;
    }
}
