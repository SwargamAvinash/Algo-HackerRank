import java.util.Scanner;
import java.lang.*;


class Solution {

	int magicSquare[][] = new int[][]{
		{8,1,6},
		{3,5,7},
		{4,9,2}
	};

	void printMat(int mat[][],int m,int n){
		System.out.println("The Matrix is :- \n");
		for (int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(mat[i][j] +" ");
			}
			System.out.println();
		}
	}

	void rotate90(int mat[][],int m,int n){
		for(int i=0;i<m/2;i++){
			for(int j=i;j<m-1-i;j++){
				int temp = mat[i][j];
				mat[i][j] = mat[m-j-1][i];
				mat[m-j-1][i] = mat[m-1-i][m-1-j];
				mat[m-1-i][m-1-j] = mat[j][m-1-i];
				mat[j][m-1-i] = temp; 
			}
		}
	}

	int[][] transposeOfMat(int mat[][],int m,int n){
		int transposeMat[][] = new int[n][m];
		for (int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				transposeMat[i][j] = mat[j][i];
			}
		}
		// printMat(transposeMat,m,n);
		return transposeMat;
	}

	int calculateMin(int mat[][],int calmat[][],int m,int n){
		int sum = 0;
		for (int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				sum += Math.abs(mat[i][j] - calmat[i][j]);
			}
		}
		return sum;
	}

	int findMinimum(int mat[][],int m,int n){
		int min = Integer.MAX_VALUE;
		for(int i=0;i<=3;i++){
			int temp = calculateMin(mat,magicSquare,m,n);
			if(temp < min){
				min = temp;
			}
			temp = calculateMin(mat,transposeOfMat(magicSquare,m,n),m,n);
			if(temp < min){
				min = temp;
			}
			rotate90(magicSquare,m,n);
		}
		return min;
	}
	
	public static void main(String[] args) {
		int m,n;
		Scanner in = new Scanner(System.in);
		m = 3;
		n = 3;

		int mat[][] = new int[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				mat[i][j] = in.nextInt();
			}
		}
		Solution thisClass = new Solution();
		System.out.println(thisClass.findMinimum(mat,m,n));
	}
}