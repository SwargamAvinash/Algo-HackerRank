import java.util.Scanner;
import java.lang.*;
import java.util.Collections;
import java.util.Arrays;

class Solution {
	private static Scanner in = new Scanner(System.in);

	public static void printArray(int[] a,int n){
		for (int i=0;i<n;i++){
			System.out.print(a[i] + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args){
		int n = in.nextInt();
		int[] a = new int[n]; //Cannot use Primitive types if I want to get min using collections.

		for(int i=0;i<n;i++){
			a[i] = in.nextInt();
		}
		// printArray(a,n);
		System.out.println(n);
		int min = Integer.MAX_VALUE;
		int count = n;
		while (min > 0 && count > 1){
			min = Arrays.stream(a).min().getAsInt();
			// System.out.println("The min in the Array :: " + min);
			for(int i=0;i<count;i++) a[i] = a[i] - min;
			count = (int)Arrays.stream(a).filter(i -> (i>0)).count(); 
			a = Arrays.stream(a).filter(i-> (i>0)).toArray();
			// printArray(a,count);
			if (count > 0) System.out.println(count);
		}
	}
}