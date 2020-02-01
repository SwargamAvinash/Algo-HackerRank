import java.util.Scanner;

class Solution{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t>0){
			int n,m,s,residue;
			n = in.nextInt();
			m = in.nextInt();
			s = in.nextInt();
			if(m > n){
				m = m % n;
			}
			residue = n - s + 1;
			if(m <= residue){
				System.out.println( (s + m - 1) == 0 ? n : (s+m-1) );
			}else{
				m = m-residue;
				System.out.println(1 + m - 1);
			}
			t--;
		}
	}
}