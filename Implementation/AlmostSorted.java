import java.util.Scanner;
import java.util.ArrayList;

class Solution{

	public void printArray(int arr[],int start, int end){
		for(int i=start;i<end;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
	}

	public boolean is_sorted(int arr[] , int n){
		for(int i=1 ;i<n ;i++){
			if(arr[i] < arr[i-1]){
				return false;
			}
		}
		return true;
	}


	public void reverse(int arr[],int h,int l){
		int rounds = (l-h)/2;
		for(int i=0;i<=rounds;i++){
			int temp = arr[i+h];
			arr[i+h] = arr[l -i];
  			arr[l -i] = temp;
		}
	}

	public void swap(int arr[],int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public void printIfPossible(int arr[],int n){
		if (n == 1 || n == 0) System.out.println("yes");

		ArrayList<Integer> peaks = new ArrayList<Integer>();
		ArrayList<Integer> dips = new ArrayList<Integer>();

		for(int i=1;i<n-1;i++){
			if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
				peaks.add(i+1);
			}else if(arr[i]<arr[i-1] && arr[i]<arr[i+1]){
				dips.add(i+1);
			}
		}

		// System.out.println(peaks);
		// System.out.println(dips);

		if(peaks.isEmpty() && dips.isEmpty()){
			System.out.println("yes");
			boolean isDescOrder = (arr[0] > arr[n-1]);
			if(isDescOrder){
				String operation = (n<=3)?"swap":"reverse";
				System.out.println(operation + " 1 " + n);
			}
		}else{
			int highest = 0;
			int lowest = n;
			if(!peaks.isEmpty()){
				highest = peaks.get(0);
			}
			
			if (peaks.size() == 1){
				if (!dips.isEmpty()){
					lowest = dips.get(dips.size()-1);
				}
				// System.out.println(highest + "----" + lowest);
				reverse(arr,highest - 1,lowest-1);
				// System.out.println("The Reverse Array\n");
				// printArray(arr,0,n);
				if (is_sorted(arr,n)){
        			String op = (lowest - highest == 1) ? "swap" : "reverse";
        			System.out.println("yes");
        			System.out.println(op + " " + highest + " " + lowest);
				}
      			else
        			System.out.println("no");
			}
			else if (peaks.size() == 2)
			{
				if (dips.size() == 2)
					lowest = dips.get(dips.size()-1);
				
				swap(arr,highest - 1,lowest - 1);

				if (is_sorted(arr,n))
				{
					System.out.println("yes");
					System.out.println("swap " + highest + " " + lowest);
				}
				else
					System.out.println("no");
			}
			else
				System.out.println("no");
		}
	}

	public static void main(String[] args){
		int n;
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = in.nextInt();
		}

		Solution ans = new Solution();
		ans.printIfPossible(arr,n);
	}	
}