import java.util.Scanner;

class Solution{

	public void printArray(int arr[],int start, int end){
		for(int i=start;i<end;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
	}

	public void printIfPossible(int arr[],int n){
		if (n == 1 || n == 0) System.out.println("yes");
		int[] indexes = new int[n];
		int[] direction = new int[n]; // 1 increasing -1 decreasing.

		indexes[0] = 1;
		int index = 0;

		if (arr[2] > arr[1]) direction[0] = 1;
		else direction[0] = -1;
		
		int direction_index = 0;
		int s,e;
		for(int i=2;i<=n;i++){

		}


		printArray(indexes,0,index);
		printArray(direction,0,direction_index);
	}

	public static void main(String[] args){
		int n;
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		int arr[] = new int[n+1];
		for(int i=1;i<=n;i++){
			arr[i] = in.nextInt();
		}

		Solution ans = new Solution();
		ans.printIfPossible(arr,n);
	}	
}