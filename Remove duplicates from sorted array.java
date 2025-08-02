class Solution {
    public int removeDuplicates(int[] nums) {
        TreeMap<Integer,Integer>hm=new TreeMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }
        int j=0;
        
        for(int i:hm.keySet()){
            nums[j]=i;
            j++;
        }
        return j;
    }
}
