import java.util.Scanner;

class Solution{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n+1];
		int[] ans = new int[n+1];

		for (int i=1;i<=n;i++){
			a[i] = in.nextInt();
		}
		for(int i=1;i<=n;i++){
			ans[a[a[i]]] = i;
		}
		for(int i=1;i<=n;i++){
			System.out.println(ans[i]);
		}
	}
}