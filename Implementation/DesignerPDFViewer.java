import java.util.Scanner;
import java.util.ArrayList;

class Solution{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int[] heights_alpha = new int[26];

		for (int i=0;i<26;i++){
			heights_alpha[i] = in.nextInt();
		}
		
		//Need to use this if I am taking String Input After the Int.. To skip the New line.
		in.nextLine(); 
		
		String inputString = in.nextLine();
		int max = Integer.MIN_VALUE;
		for(int i=0;i<inputString.length();i++){
			int temp = heights_alpha[inputString.charAt(i) - 97];
			if(max < temp){
				max = temp;
			}
		}
		System.out.println(max * inputString.length());
	}
}