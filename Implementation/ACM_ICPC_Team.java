import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


class Solution{
	private static Scanner in  = new Scanner(System.in);


	private static int findBitOROfBothStrings(String s1,String s2,int m){
		int count = 0;
		for(int i=0;i<m;i++){
			// System.out.println( "The char Value ::\t" + s1.charAt(i) + "Integer Value " + Integer.valueOf(s1.charAt(i)));
			count += (Integer.valueOf(s1.charAt(i)) - 48) | (Integer.valueOf(s2.charAt(i)) - 48);
		}
		return count;
	}

	public static void main(String[] args){
		int n = in.nextInt();
		int m = in.nextInt();
		in.nextLine();

		List<String> strings = new ArrayList<String>(n);
		for(int i=0;i<n;i++){
			strings.add(in.nextLine());
		}

		int max_subjects = Integer.MIN_VALUE;
		int count = 0;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				int subjects = findBitOROfBothStrings(strings.get(i),strings.get(j),m);
				if(subjects > max_subjects){
					max_subjects = subjects;
					count = 1;
				}else if (subjects == max_subjects){
					count++;
				}
			}
		}
		System.out.println(max_subjects);
		System.out.println(count);
	}
}