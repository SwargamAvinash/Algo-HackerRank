import java.util.Scanner;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Arrays;
import java.util.ArrayList;


class Solution{
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args){
		int n = in.nextInt();
		int[] arr = new int[n];

		for(int i=0;i<n;i++){
			arr[i] = in.nextInt();
		}
		Map<Integer,List<Integer>> store = new HashMap<Integer,List<Integer>>();

		List<Integer> temp;
		for(int i=0;i<n;i++){
			if (store.containsKey(arr[i])){
				temp = store.get(arr[i]);
				temp.add(i);
			}else{
				List<Integer> l = new ArrayList<Integer>();
				l.add(i);
				store.put(arr[i],l);
			}
		}
		// System.out.println(store);
		int min = Integer.MAX_VALUE;
		for(List<Integer> l : store.values()){
			if(l.size() > 1){
				for(int i=1;i<l.size();i++){
					min = Math.min(min,Math.abs(l.get(i) - l.get(i-1)));
				}
			}
		}
		System.out.println((min == Integer.MAX_VALUE) ? -1:min);
	}
}