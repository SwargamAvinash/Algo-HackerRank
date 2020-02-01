import java.util.Scanner;
import java.lang.Math;

class Solution{

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int start,end,k;
		start = in.nextInt();
		end = in.nextInt();
		k = in.nextInt();

		int ans = 0;

		for(int i=start;i<=end;i++){
			int reverse = Integer.valueOf(new StringBuilder(String.valueOf(i)).reverse().toString());
			if(Math.abs(i - reverse) % k == 0){
				ans++;
			} 
		}
		System.out.println(ans);
	}
}