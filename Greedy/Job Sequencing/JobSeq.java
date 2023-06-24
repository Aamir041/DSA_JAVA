import java.util.*;

public class JobSeq{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of jobs: ");
		int n =  sc.nextInt();

		String[] jobId = new String[n];
		int[][] mat = new int[n][2];

		for(int i=0; i<n; i++){
			jobId[i] = "J"+(i+1);
			System.out.print("Enter profit for "+ jobId[i]+ " : ");
			mat[i][0] = sc.nextInt();
			
			System.out.print("Enter deadline for "+ jobId[i]+ " : ");
			mat[i][1] = sc.nextInt();
		}


		for(int i=0; i<n; i++){
			for(int j = i; j>0; j--){
				if(mat[j-1][0] < mat[j][0]){
					
					int[] temp = new int[2];
					String tempId = jobId[j-1];
					temp[0] = mat[j-1][0];
					temp[1] = mat[j-1][1];

					jobId[j-1] = jobId[j];
					mat[j-1][0] = mat[j][0];
					mat[j-1][1] = mat[j][1];
					
					jobId[j] = tempId;
					mat[j][0] = temp[0];
					mat[j][1] = temp[1];

				}
			}
		}

		for(int i=0; i<n; i++){
			System.out.println(jobId[i]+" "+Arrays.toString(mat[i]));
		}

		int maxDeadline = 0;
		for(int i=0; i<n; i++){
			if(mat[i][1] > maxDeadline){
				maxDeadline = mat[i][1];
			}
		}

		System.out.println(maxDeadline);

		String[] jobSeqMat = new String[maxDeadline];
		for(int i=0; i<maxDeadline; i++){
			jobSeqMat[i] = "-1";
		}

		System.out.println(Arrays.toString(jobSeqMat));

		for(int i=0; i<n; i++){
			int index = mat[i][1]-1;
			System.out.println(index);
			for(int j = index; j<=0; j--){
				if(jobSeqMat[j] == -1){
					jobSeqMat[j] = i+1;
					break;
				}
			}
		}

		System.out.println(Arrays.toString(jobSeqMat));


	}
}