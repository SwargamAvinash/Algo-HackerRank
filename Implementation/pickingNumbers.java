import java.util.Scanner; // Need to know more about the java utils functions.
import java.util.Collections;
import java.util.Arrays;

class Solution{

	public Integer[] a = new Integer[101]; // It seems in Java array's directly initialized with default value.

	public int longestArr(int arr[],int n){

		//Initialize the Integer Array
		for (int i=0;i<101;i++){
			a[i] = 0;
		}

		for (int i=0;i<n;i++){
			a[arr[i]] += 1;
		}

		int max = Collections.max(Arrays.asList(a)); // Integer Class Needs to be used for most of the stuff I guess.

		for (int i=1;i<101;i++){
			int temp = a[i] + a[i-1];
			if(max < temp){
				max = temp;
			}
		}
		return max;
	}

	public static void main(String[] args){
		int n;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();

		int[] arr = new int[n];
		for (int i=0;i<n;i++){
			arr[i] = in.nextInt();
		}
		Solution ans = new Solution();
		System.out.println(ans.longestArr(arr,n));
	}
}