import java.util.Scanner;

class Solution{
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args){
		int n = in.nextInt();
		int[] arr = new int[n];

		for(int i=0;i<n;i++){
			arr[i] = in.nextInt();
		}

		int steps = 0;
		int i = 0;
		while(i<n-1){
			if(i<n-2 && arr[i+2] != 1 ){
				i = i+2;
			}else{
				i = i + 1;
			}
			steps++;
		}
		System.out.println(steps);
	}
}