import java.util.Scanner;
import java.lang.Math;

class Solution{

	public static void main(String[]  args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t>0){
			int cycles = in.nextInt();
			int mod = cycles / 2;
			int sum = 0;
			for (int i=mod;i>=0;i--){
				sum += Math.pow(2,i);
			}
			if(cycles % 2  == 0){
				System.out.println(sum);
			}else{
				System.out.println(2*sum);
			}
			t--;
		}
	}
}