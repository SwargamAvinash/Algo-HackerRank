import java.util.Scanner;
import java.util.Arrays;

class Solution{
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args){
		int n = in.nextInt();
		int[] arr = new int[n];

		int[] num = new int[101];
		for(int i=0;i<n;i++){
			arr[i] = in.nextInt();
		}

		for(int i=0;i<n;i++){
			num[arr[i]]++;
		}

		int max = Arrays.stream(num).max().getAsInt();

		if (max == 1){
			System.out.println(n-1);
		}else{
			System.out.println(n-max);
		}
	}
}