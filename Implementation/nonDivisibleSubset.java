import java.util.Scanner;
import java.lang.*;
import java.util.Arrays;

class Solution{
	private static Scanner in = new Scanner(System.in);

	public static void printArray(int[] a,int n){
		for (int i=0;i<n;i++){
			System.out.print(a[i] + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args){
		int n = in.nextInt();
		int k = in.nextInt();
		int[] arr = new int[n];

		for(int i=0;i<n;i++){
			arr[i] = in.nextInt();
		}

		int[] rem = new int[k];
		for (int i=0;i<n;i++){
			rem[arr[i] % k]++;
		}
		// printArray(rem,k);
		int size = 0;
		if (rem[0] != 0) size++;
		int end;

		if ((k%2) == 0) end = k/2;
		else end = (k/2) + 1;

		for(int i=1;i<end;i++){
			if(rem[i] > rem[k-i]) {
				size += rem[i];
			}
			else if(rem[i] < rem[k-i]) {
				size += rem[k-i];
			}
			else{
				size += rem[i];
			}
		}

		if(k%2 == 0){
			System.out.println(size + 1);
		}else{
			System.out.println(size);
		}
	}
}