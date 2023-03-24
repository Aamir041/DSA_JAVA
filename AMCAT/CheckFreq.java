import java.util.*;
import java.util.Map.Entry;

public class CheckFreq{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String str = "Hello Misses, Jakela Bidris how would i help you? said Betty from doll store.";
		
		str = str.replace(" ","");

		char[] letters = str.toCharArray();

		HashMap<Character, Integer> hashT = new HashMap<>();

		for(int i=0; i<letters.length; i++){
			if(hashT.containsKey(letters[i])){
				hashT.put(letters[i],hashT.get(letters[i])+1);
			}
			else{
				hashT.put(letters[i],1);
			}
		}

		System.out.print("Enter letter to get frequency: ");
		
		char searchChar = sc.next().charAt(0);

		if(hashT.containsKey(searchChar)){
			System.out.println(searchChar+ " is present "+hashT.get(searchChar)+" times in sentence.");
		}
		else{
		    System.out.println(searchChar+" does not exist in sentence.");	
		}

	}
}