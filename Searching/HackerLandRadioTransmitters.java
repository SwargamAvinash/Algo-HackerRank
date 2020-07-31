import java.util.Scanner;
import java.util.Arrays;

class Solution{
	private static Scanner in = new Scanner(System.in);

	private static int minTransmitterRequired(int arr[],int n,int k){
		int i = 0;
		int transmitters = 0;
		while(i<n){
			transmitters++;
			int temp = arr[i] + k;
			while(i<n && arr[i] <= temp) i++;
			i = i - 1;
			temp = arr[i] + k;
			while(i<n && arr[i] <= temp) i++;
		}
		return transmitters;
	}

	public static void main(String[] args){
		int n = in.nextInt();
		int k = in.nextInt();
		int[] arr = new int[n];

		for(int i=0;i<n;i++){
			arr[i] = in.nextInt();
		}
		Arrays.sort(arr); // Need to sort the house positions.
		System.out.println(minTransmitterRequired(arr,n,k));
	}
}

