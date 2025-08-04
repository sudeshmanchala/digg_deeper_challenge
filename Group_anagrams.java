class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>arr=new ArrayList<>();
        HashMap<String,Integer>hm=new HashMap<>();
        int k=0;
        for(String s:strs){
            char[] str=s.toCharArray();
            Arrays.sort(str);
            String qw=new String(str);
            if(!hm.containsKey(qw)){
                hm.put(qw,k);
                
                arr.add(new ArrayList());
                arr.get(k).add(s);
                k++;
            }
            else{
                arr.get(hm.get(qw)).add(s);
            }
        }
        return arr;
    }
}
