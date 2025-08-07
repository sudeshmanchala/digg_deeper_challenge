class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low=0;
        int[] arr=new int[2];
        int high=numbers.length-1;
        while(low<high){
            if((numbers[low]+numbers[high])==target){
                arr[0]=low+1;
                arr[1]=high+1;
                break;
            }
            else if((numbers[low]+numbers[high])>target){
                high=high-1;
            }
            else{
                low=low+1;
            }

        }
        return arr;
    }
}
