public class linearSearchInStrings {
    public static void main(String[] args) {

       String name = "France";
       char character = 'r';

       boolean result = searchCharacter(name, character);
       System.out.println(result);

       boolean result2 = searchCharacter2(name, character);
       System.out.println(result2);

    }

    static boolean searchCharacter(String str, char target){
        
        // if string length is 0 return false
        if(str.length() == 0){
            return false;
        }

        // iterate over every single character in string
        for(int i = 0; i<str.length(); i++){
            
            // if character in string same as target character then return true
            // str.charAt(i) gives character at index i in string str
            if(str.charAt(i) == target){
                return true;
            }
        }

        // after iterating over every character at string no match found then return false
        return false;
    }

    // using enhanced for loop to search character in a string
    static boolean searchCharacter2(String str, char target){

        // if string length is 0 return false
        if(str.length()==0){
            return false;
        }

        // to get array of char from string use method .toCharArray on string
        // after getting array use enhanced for loop
        for(char c: str.toCharArray()){
            if( c == target){
                return true;
            }
        }

        // after iterating over every character at string no match found then return false
        return false;
    }
}
