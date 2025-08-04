class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] arr=new int[26];
        int[] arr2=new int[26];
        Arrays.fill(arr,0);
         Arrays.fill(arr2,0);

        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
            arr2[t.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}
