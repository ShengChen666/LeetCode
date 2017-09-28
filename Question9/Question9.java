class Solution {
    public boolean isPalindrome(int x) {
        String temp = x+"";
        if(x<0){
            return false;
        }
        int size = temp.length();
        if(size%2==0){
            return helper(temp,size/2-1,size/2);
        }else{
            return helper(temp,size/2,size/2);
        }
    }
    public boolean helper(String t,int i,int j){
        while(i>-1 && j <t.length()){
            if(t.charAt(i)==t.charAt(j)){
            i--;
            j++;
        }else{
                return false;
            }
        }
        return true;
    }
}