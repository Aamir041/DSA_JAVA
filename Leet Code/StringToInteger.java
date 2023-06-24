// status : un solved :(

public class StringToInteger {
    public static void main(String[] args) {
        System.out.println(myAtoi("-91283472332"));
    }

    static int myAtoi(String s){
        s =s.replaceAll(" ", "");
        String number="";
        for(int i =0; i<s.length();i++){
            String strTemp = ""+ s.charAt(i);
            if(!strTemp.matches("[0-9+-]")){
                break;
            }
            else{
                number = number+strTemp;
            }
        }
        if(number.length() == 0){
            return 0;
        }

        if(Integer.MAX_VALUE < Long.parseLong(number)){
            return Integer.MAX_VALUE;
        }

        return Integer.parseInt(number);
    }
}
