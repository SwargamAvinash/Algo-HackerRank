import java.util.Scanner;
import java.util.Arrays;
import java.lang.StringBuilder;


/* 
	Algo For Lexographical Sort
	1) If the Complete string is in Decreasing order then there is no next Lexical next..

	Process ::
	1) Find the Position where the Decreasing Breaks from the Back side. 
	2) Save that Position 
	3) Replace or swap this char with Greatest Minimum from all the Charecters After this to the Right

	4) After Replace Just Sort the Rest of the String from right side of the Position you stored.
*/
class Solution{
	private static Scanner in = new Scanner(System.in);


	public static String getNextLexographicalString(String s){
		int L = s.length();
		int indexNonDecreaing = -1;
		for (int i=L-1;i>0;i--){
			if(s.charAt(i) > s.charAt(i-1)){
				indexNonDecreaing = i-1;
				break;
			}
		}
		// System.out.println("The Non Decreasing Char is :: " +s.charAt(indexNonDecreaing) + " Index :: "+indexNonDecreaing);
		if (indexNonDecreaing == -1) return "no answer";

		int greatestMin = 0;
		char greatestMinChar = 'z' + 1;
		for(int i=indexNonDecreaing + 1;i<L;i++){
			if (s.charAt(indexNonDecreaing) < s.charAt(i) && s.charAt(i) < greatestMinChar){
				greatestMinChar = s.charAt(i);
				greatestMin = i;
			}
		}
		System.out.println("The Greatest Min char is :: " + greatestMinChar);

		// Swap those .
		StringBuilder stringBuilder = new StringBuilder(s);
		stringBuilder.setCharAt(greatestMin,stringBuilder.charAt(indexNonDecreaing));
		stringBuilder.setCharAt(indexNonDecreaing,greatestMinChar);

		System.out.println("After Swaping ::  " + stringBuilder);

		//Sort the Rest of the String..
		System.out.println("The substring that is going to Sorted :: " + stringBuilder.toString().substring(indexNonDecreaing+1,L));
		char tempArray[] = stringBuilder.toString().substring(indexNonDecreaing+1,L).toCharArray();
		Arrays.sort(tempArray);

		for(int i=indexNonDecreaing+1;i<L;i++){
			stringBuilder.setCharAt(i,tempArray[i - indexNonDecreaing - 1]);
		}
		return stringBuilder.toString();
	}

	public static void main(String[] args){
		int t = in.nextInt();
		in.nextLine();

		while(t>0){
			String s = in.nextLine();
			System.out.println(getNextLexographicalString(s));
			t--;
		}
	}
}