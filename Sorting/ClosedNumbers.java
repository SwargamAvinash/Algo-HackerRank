import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution{
	private static Scanner in = new Scanner(System.in);


	public static void printSmallestAbsoluteDifference(List<Integer> a, int n){
		Collections.sort(a); //The Function or package tells you every thing.. 
		// What ever you want to do with the Collections it will be there in the Collections Package
		//Like Arrays Package what ever you want to do with the Arrays will be in the Arrays Package.
		// System.out.println(a);
		List<Integer> ans = new ArrayList<>();
		int minDistance = Integer.MAX_VALUE;
		for(int i=1;i<n;i++){
			if (Math.abs(a.get(i) - a.get(i-1)) < minDistance) minDistance = Math.abs(a.get(i) - a.get(i-1));
		}

		for(int i=1;i<n;i++){
			if(Math.abs(a.get(i) - a.get(i-1)) == minDistance) {
				ans.add(a.get(i-1));
				ans.add(a.get(i));
			}
		}
		Collections.sort(ans);
		System.out.println(ans.toString().replace("[","").replace("]",""));
	}

	public static void main(String[] args){
		int n = in.nextInt();
		List<Integer> a = new ArrayList<>(n);

		for(int i=0;i<n;i++){
			a.add(in.nextInt());
		}
		printSmallestAbsoluteDifference(a,n);
	}
}