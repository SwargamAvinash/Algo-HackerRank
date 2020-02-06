import java.util.Scanner;
import java.util.Arrays;

class Solution{
	private static Scanner in = new Scanner(System.in);


	private static void printMatrix(int[][] mat , int rows,int columns){
		for (int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				System.out.println(mat[i][j] + " ");
			}
			System.out.println("");
		}
	}

	private static void printArray(int[] a, int n){
		for(int i=0;i<n;i++){
			System.out.println(a[i] + " ");
		}
		System.out.println("");
	}

	private static String isPossible(int[][] matrix,int n){
		int[] ballsInContainer_rowSum = new int[n];
		int[] ballsEachType_columnSum = new int[n];

		// Row Sum..
		for(int i=0;i<n;i++){
			int count = 0;
			for(int j=0;j<n;j++){
				count += matrix[i][j];
			}
			ballsInContainer_rowSum[i] = count;
		}

		// Column Sum..
		for(int i=0;i<n;i++){
			int count = 0;
			for(int j=0;j<n;j++){
				count += matrix[j][i];
			}
			ballsEachType_columnSum[i] = count;
		}
		Arrays.sort(ballsInContainer_rowSum);
		Arrays.sort(ballsEachType_columnSum);

		for(int i=0;i<n;i++){
			if(ballsInContainer_rowSum[i] != ballsEachType_columnSum[i]) return "Impossible";
		}
		return "Possible";
	}
	
	public static void main(String[] args){
		int q = in.nextInt();
		while(q>0){
			int n = in.nextInt();
			int[][] matrix = new int[n][n];
			for (int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					matrix[i][j] = in.nextInt();
				}
			}
			System.out.println(isPossible(matrix,n));
			q--;
		}
	}
}