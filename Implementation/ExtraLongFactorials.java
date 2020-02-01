import java.util.Scanner;
import java.math.BigInteger;

// How do you handle the Big Factorials in Cpp or C ..???

class Solution{
	private static Scanner in = new Scanner(System.in);

	static BigInteger factorial(BigInteger N){
		BigInteger one = BigInteger.ONE;
		if(N.equals(one)) return one;
		return N.multiply(factorial(N.subtract(one)));
	}

	public static void main(String[] args){
		int n = in.nextInt();
		System.out.println(factorial(BigInteger.valueOf(n)));
	}
}