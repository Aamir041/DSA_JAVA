class Solution {
    
    public int compress(char[] chars) {
        if(chars.length == 1) return 1;
        
        String str = "";
        int count = 1;
        
        char t = chars[0];

        for(int i=1; i<chars.length; i++){  
            if(chars[i] == t){
                count++;
            }
            else{
                if(count == 1){
                    str = str + (""+t);
                }
                else{
                    str = str + (""+t)+count;
                }
                t=chars[i];
                count=1;
            }
        }
        if(count == 1){
            str = str + (""+t);
        }
        else{
            str = str + (""+t)+count;
        }
        
        for(int i=0; i<str.length(); i++){
            chars[i]=str.charAt(i);
        }        


        return str.length();

    }

    
}