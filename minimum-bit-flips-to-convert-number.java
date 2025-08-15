class Solution {
    public int minBitFlips(int start, int goal) {
        if(start==goal){
            return 0;
        }
        String st=Integer.toBinaryString(start);
        String gt=Integer.toBinaryString(goal);
        // System.out.println(st);
        // System.out.println(gt);
        String str="";
        if(st.length()<gt.length()){
            for(int k=0;k<gt.length()-st.length();k++){
            str=str+'0';
        }
        st=str+st;
        }
        else{
        for(int k=0;k<st.length()-gt.length();k++){
            str=str+'0';
        }
        gt=str+gt;
        }
        //gt=str+gt;
        int c=0;
        int ch=gt.length()-1;
        for(int i=0;i<st.length();i++){
            if((ch>=i) && st.charAt(i)!=gt.charAt(i)){
                c++;
            }
        }
        return c;
    }
}
