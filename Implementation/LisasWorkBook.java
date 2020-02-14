import java.util.Scanner;

class Solution{
	private static Scanner in = new Scanner(System.in);


	public static int specialExamples(int n,int k,int a[]){
		int[] pages = new int[n];
		for(int i=0;i<n;i++){
			pages[i] = (a[i] % k == 0) ? (a[i] / k) : ((a[i]/k) + 1);
		}

		int pageNumber = 1;
		int special = 0;
		for(int i=0;i<n;i++){
			int p = pages[i];
			for(int j=0;j<p;j++) {
				int exampleStart = k*j;
				int exampleEnd = k*(j+1);
				if(exampleEnd > a[i]) exampleEnd = a[i];
				if((pageNumber+j)>(exampleStart) && (pageNumber+j)<=exampleEnd){
					special++;
				}
			}
			pageNumber += p;
		}
		return special;
	}

	public static void main(String[] args){
		int n = in.nextInt();
		int k = in.nextInt();
		int[] a = new int[n];

		for(int i=0;i<n;i++){
			a[i] = in.nextInt();
		}

		System.out.println(specialExamples(n,k,a));
	}
}