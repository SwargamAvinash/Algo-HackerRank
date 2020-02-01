import java.util.Scanner;

class Solution {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t>0){
			int n,limit;
			n = in.nextInt();
			limit = in.nextInt();
			int[] a = new int[n];

			for (int i=0;i<n;i++){
				a[i] = in.nextInt();
			}
			int count = 0;
			for(int i=0;i<n;i++){
				if(a[i]<=0) count ++;
			}

			if(count>=limit){
				System.out.println("NO");
			}else{
				System.out.println("YES");
			}
			t--;
		}
	}
}