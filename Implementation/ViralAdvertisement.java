import java.util.Scanner;
import java.lang.Math;

class Solution{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int n_likes = 0;
        int people = 5;
		for (int i=n;i>0;i--){
			n_likes += (people/2);
			people = (people/2) * 3;
		}
		System.out.println(n_likes);
	}
}

