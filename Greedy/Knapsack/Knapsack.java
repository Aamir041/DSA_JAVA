import java.util.*;

class Objs{
	int wt;
	int pft;
	float rt;
}

public class Knapsack{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n,wt;
		System.out.print("Enter number of objects: "); 
		n = sc.nextInt();

		System.out.print("Enter max of weight: "); 
		wt = sc.nextInt();

		Objs[] objects = new Objs[n];
		float[] objPresent = new float[n];
		
		for(int i=0; i<n; i++){
			objects[i] = new Objs();
			System.out.print("\nEnter Weight of Object["+ (i+1) +"] : ");
			objects[i].wt = sc.nextInt();
			System.out.print("Enter Profit of Object["+ (i+1) +"] : ");
			objects[i].pft = sc.nextInt();
			objects[i].rt = (float)objects[i].pft / (float)objects[i].wt;
			
		}

		while(wt != 0){
			int i = objNum(objects,objPresent,wt);
			wt -= objPresent[i] * objects[i].wt;
		}

		int totalProfit = 0;
		for(int i=0; i<n; i++){
			totalProfit += objects[i].pft*objPresent[i];
		}

		System.out.println("\nTotal Profit: "+ totalProfit);

	}


	static int objNum(Objs[] objects, float[] objPresent,int wt){
		int n = objects.length;
		float maxRt = 0f;
		int index = -1;
		for(int i=0; i<n; i++){
			if( objects[i].rt > maxRt && objPresent[i] == 0f ){
				index = i;
				maxRt = objects[i].rt;
			}
		}
		if(wt - objects[index].wt < 0){
			objPresent[index] = wt / (float)objects[index].wt; 
		}
		else{
		    objPresent[index] = 1;	
		}
		return index;
	}


}