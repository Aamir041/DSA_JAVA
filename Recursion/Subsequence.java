import java.util.*;

public class Subsequence{
	public static void main(String[] args) {
		int[] arr = {3,1,2};
		List<Integer> list = new ArrayList<>();
		subSets(0,arr,list);
	}

	static void subSets(int index,int[] arr, List<Integer> list){
		if(index ==  arr.length){
			System.out.println(list);
			return ;
		}
		list.add(arr[index]);
		subSets(index+1,arr,list);
		list.remove(list.size()-1);
		subSets(index+1,arr,list);

	}
}