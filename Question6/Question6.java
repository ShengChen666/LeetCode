class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        StringBuffer[] sb = new StringBuffer[numRows];
        for (int i = 0; i < sb.length; i++){
            sb[i] = new StringBuffer();
        }
            int temp =0;
            loop:while(true){
                for(int i =0;i<numRows;i++){
                    sb[i].append(s.charAt(temp));
                    temp++;
                    if(temp>=s.length()){
                        break loop;
                    }
                }
                for(int i =numRows-2;i>0;i--){
                    sb[i].append(s.charAt(temp));
                    temp++;
                    if(temp>=s.length()){
                        break loop;
                    }
                }
            }
        
        for (int idx = 1; idx < sb.length; idx++){
        sb[0].append(sb[idx]);
        }
    return sb[0].toString();
    }
}