class Solution {
    public int reverse(int x) {
        if(x<10&&x>-10){
            return x;
        }
        boolean neg = false;
        Integer t;
        if(x<0){
            neg = true;
            t=-1*x;
        }else{
            t=x;
        }
        String temp = t.toString();
        StringBuffer sb =new StringBuffer();
        for(int i =temp.length()-1; i>-1;i--){
            sb.append(temp.charAt(i));
        }
        try{if(neg){
             return -1*Integer.parseInt(sb.toString());
        }else{
             return Integer.parseInt(sb.toString());
        }
            
        }catch(Exception e){
            return 0;
}
       
    }
}