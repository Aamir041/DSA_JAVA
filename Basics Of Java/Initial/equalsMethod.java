public class equalsMethod {
    public static void main(String[] args){
        String name1 = "Aamir";

        String name2  = new String("Aamir");

        /* 
         == checks if two object points to same location in  heap if yes then return then true or else false
         &
         .equala check if two objects has same value or not and if value is same same then it is true or else false
        */

        if(name1 == name2){
            System.out.println("from == it is True");
        } else {
            System.out.println("from == it is False");
        }

        if(name1.equals(name2)){
            System.out.println("from '.equals' it is True");
        } else {
            System.out.println("from '.equals' it is False");
        }


    }
}