class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        String temp = "";
        String t ;
        int length = s.length();
       for(int i =0;i<length;i++){
            t=s.substring(0,1);
            if(temp.indexOf(t)>=0){
                temp=temp.substring(temp.indexOf(t)+1,temp.length());
                temp=temp+t;
            }else{
            temp=temp+t;
        }
        s=s.substring(1);
        if(temp.length()>max){
            max = temp.length();
            }
        }
        if(temp.indexOf(s)<0 && temp.length()+1>max){
                max = temp.length()+1;
        }
        return max;
    }
}