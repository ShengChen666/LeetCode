class Solution {
    public int lengthOfLongestSubstring(String s) {
         HashMap<Character, Integer> map = new HashMap<Character, Integer>();
         int length = s.length();
         int temp = 0;
         int result = 0;
         for(int i = 0;i<length;i++){
            if(map.containsKey(s.charAt(i))){
                temp = Math.max(temp,map.get(s.charAt(i)));
            }
            result=Math.max(result,i-temp+1);
            map.put(s.charAt(i),i+1);
         }
         return result;
}
}