import java.util.Scanner;
import java.lang.*;
import java.math.BigInteger;

class Solution{
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args){
		int t = in.nextInt();
		while(t>0){
			BigInteger b = BigInteger.valueOf(in.nextInt());
			BigInteger w = BigInteger.valueOf(in.nextInt());
			BigInteger bc = BigInteger.valueOf(in.nextInt());
			BigInteger wc = BigInteger.valueOf(in.nextInt());
			BigInteger z = BigInteger.valueOf(in.nextInt());

			BigInteger c1 = w.multiply(wc).add(b.multiply(bc));
			BigInteger c2 = w.multiply(wc).add(b.multiply(wc.add(z)));
			BigInteger c3 = w.multiply(bc.add(z)).add(b.multiply(bc));
			BigInteger c4 =  w.multiply(bc.add(z)).add(b.multiply(wc.add(z)));

			System.out.println(c4.min(c3.min(c2.min(c1))));
			t--;
		}
	}
}