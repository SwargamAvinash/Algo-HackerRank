import java.util.Scanner;

class Solution{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n , k ,q;
		n = in.nextInt();
		k = in.nextInt();
		q = in.nextInt();

		int[] a = new int[n];
		for (int i=0;i<n;i++){
			a[i] = in.nextInt();
		}
		if(k>n) k = k % n;
		while(q>0){
			int n1 = in.nextInt();
			if (n1 < k){
				System.out.println(a[n+n1-k]);
			}else{
				System.out.println(a[n1-k]);
			}
			q--;
		}
	}
}