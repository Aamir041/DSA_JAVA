import java.util.*;
import java.util.Map.*;


public class MaxCountFreq{
	public static void main(String[] args) {
		
		String inStr = "Aamir Alipasha Saudagar";
		inStr = inStr.replace(" ","");
		
		char[] letters = inStr.toCharArray();

		HashMap<Character,Integer> hashT = new HashMap<>();
		
		for(int i=0; i<letters.length; i++){
			if(hashT.containsKey(letters[i])){
				hashT.put(letters[i], hashT.get(letters[i])+1);
			}
			else{
				hashT.put(letters[i],1);
			}

		}

		Set<Entry<Character,Integer>> entrySet = hashT.entrySet();

		List<Entry<Character, Integer>> list = new ArrayList<>(entrySet);

		Collections.sort(list, new Comparator<Entry <Character, Integer>>() {
			
			public int compare(Entry<Character,Integer> o1, Entry<Character, Integer> o2){
				if(o1.getValue() > o2.getValue()) return -1;
				if(o1.getValue() < o2.getValue()) return 1;
				return 0;
			}
		});


		System.out.println(list.get(0).getKey());

	}
}