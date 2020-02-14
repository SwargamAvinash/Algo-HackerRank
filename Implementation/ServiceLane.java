import java.util.Scanner;

class Solution{
	private static Scanner in = new Scanner(System.in);


	public static int minOfSubarray(int a[],int start ,int end){
		int min = Integer.MAX_VALUE;
		for(int i=start;i<=end;i++){
			if (a[i] == 1) return 1;
			min = Math.min(min,a[i]);
		}
		return min;
	}

	public static void main(String[] args){
		int n = in.nextInt();
		int t = in.nextInt();
		int[] arr = new int[n];

		for(int i=0;i<n;i++){
			arr[i] = in.nextInt();
		}
		while(t>0){
			int start = in.nextInt();
			int end = in.nextInt();

			System.out.println(minOfSubarray(arr,start,end));
			t--;
		}
	}
}