import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class LilyHomework {

	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int n = in.nextInt();
		System.out.println("The scanned Integer n :: " + n);
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		System.out.println("The Minimun Swaps ::" + minSwapsRequired(arr, n));
	}

	private static int minSwapsRequired(int[] arr, int n) {
		// Creating an Map
		Map<Integer,Integer> valueIndexMap = new HashMap<>();
		for (int i = 0; i < n; i++) {
			valueIndexMap.insert(arr[i], i);
		}
		System.out.println("The Values in the Map are :: \t" + valueIndexMap);
		return 0;
	}
}