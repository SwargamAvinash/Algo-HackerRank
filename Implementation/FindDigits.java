import java.util.Scanner;

class Solution {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args){
		int t,n,n1;
		t = in.nextInt();
		while (t>0){
			int ans = 0;
			n = in.nextInt();
			n1 = n;
			while(n1 > 0){
				int digit = n1 % 10;
				if( (digit != 0) && n % digit == 0) ans ++;
				n1 = n1/10;
			}
			System.out.println(ans);
			t--;
		}
	}
}