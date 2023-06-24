import java.util.ArrayList;

public class Permutation{

    static void generate(int nums[],int index,boolean hash[],ArrayList<ArrayList<Integer>> list, ArrayList<Integer> al){
     if(index == nums.length){
        list.add(new ArrayList<>(al));
        return ;
     }
     for(int i=0; i<nums.length; i++){
        if(!hash[i]){
            hash[i] = true;
            al.add(nums[i]);
            generate(nums, index+1, hash, list, al);
            al.remove(al.size()-1);
            hash[i] = false;
        }
     }
    }

    public static void main(String[] args) {
        
        int nums[] = {3,2,1};
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> al = new ArrayList<>();
        
        boolean hash[] = new boolean[nums.length];
        
        generate(nums,0,hash,list,al);

        for(ArrayList<Integer> numList: list){
            System.out.println(numList);
        }

         
    }
}