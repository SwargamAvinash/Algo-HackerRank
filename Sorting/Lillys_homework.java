import java.util.Scanner;


/* Insersion Sort Alogrithm is not the correct Algo for finding the min number 
of swaps required to make an array sorted*/

class Solution{
	private Scanner in = new Scanner(System.in);


	public void minSwapsRequiredMakeitSorted(int[] arr) {
		
	}

	public static void main(String[] args){
		int n = in.nextInt();

		int[] arr = new int[n];
		for (int i=0;i<n;i++) {
			arr[i] = in.nextInt();
		}

		System.out.println(minSwapsRequiredMakeitSorted(arr));
	}
}