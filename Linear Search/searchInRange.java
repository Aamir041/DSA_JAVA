public class searchInRange {
    public static void main(String[] args) {
        int[] numbers = {12,89,-87,34,76,25,88,21};
        int target = -87;

        boolean result = searchWithinRange(numbers, target, 4, 99);
        System.out.println(result);

    }
    static boolean searchWithinRange(int[] array, int target,int start, int end){

        // if array length is 0 return false
        if(array.length == 0){
            return false;
        }

        // if end point of range to greater or equal than array length return false
        else if(end>=array.length){
            return false;
        }

        // iterate array from start to end of given range, and find element in that range
        for(int i=start; i<=end; i++){
            if(array[i] == target){
                return true;
            }
        }

        // if array not in given range return false
        return false;
    }
}
