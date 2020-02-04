import java.util.Scanner;
import java.math.BigInteger;

// Good Amount of BigInteger Usage.

class Solution{
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args){
		String infiniteString = in.nextLine();
		BigInteger n = new BigInteger(in.nextLine());

		BigInteger size = BigInteger.valueOf(infiniteString.length());
		// System.out.println(size);
		BigInteger cycles = n.divide(size);
		BigInteger residue = n.mod(size);
		int count_a = 0;

		for(int i=0;i<infiniteString.length();i++){
			if(infiniteString.charAt(i) == 'a'){
				count_a++;
			}
		}
		int count_residue_a = 0;
		for(int i=0;i<residue.intValue();i++){
			if(infiniteString.charAt(i) == 'a'){
				count_residue_a++;
			}
		}
		BigInteger ans = cycles.multiply(BigInteger.valueOf(count_a));
		System.out.println(ans.add(BigInteger.valueOf(count_residue_a)));
	}
}