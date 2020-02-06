import java.util.Scanner;
import java.lang.*;

class Solution{
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args){
		String s = in.nextLine();
		s.replace(" ","");
		System.out.println(s);
		double l = Math.sqrt(s.length());

		System.out.println("The Lenght of String :: " + s.length() + "--- Square root of it :: " + l);
		int row = 0;
		int column = 0;
		double floor_l = Math.floor(l);
		double ceil_l = Math.ceil(l);
		System.out.println("Floor :: " + floor_l + "--- ceil :: " + ceil_l);
		if( floor_l == ceil_l){
			System.out.println("It went into Perfect Square loop..");
			row = column = (int)l;
		}else{
			if ((floor_l * ceil_l) >= s.length()){
				row = (int)floor_l;
				column = (int)ceil_l;
			}else{
				row = (int)ceil_l;
				column = (int)ceil_l;
			}
		}
		System.out.println("The row x column is :: " + row + "x" + column);
		for(int i=0;i<column;i++){
			for(int j=i;j<s.length();j += column){
				System.out.print(s.charAt(j));
			}
			System.out.print(" ");
		}
	}
}