import java.util.Scanner;

class Solution{
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args){
		int t = in.nextInt();
		while(t>0){
			int n = in.nextInt();
			int c = in.nextInt();
			int m = in.nextInt();

			int wrappers = n/c;

			int count = wrappers;
			while(wrappers>=m){
				int bars = wrappers / m;
				wrappers = bars + (wrappers % m);
				count += bars;
			}
			System.out.println(count);
			t--;
		}
	}
}