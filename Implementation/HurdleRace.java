import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Solution{

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n,h;
		n = in.nextInt();
		h = in.nextInt();

		ArrayList<Integer> heights = new ArrayList<Integer>();
		for (int i=0;i<n;i++){
			heights.add(in.nextInt());
		}
		int max_height = Collections.max(heights);
		System.out.println( ((max_height - h) > 0) ? (max_height-h):0);
	}
}