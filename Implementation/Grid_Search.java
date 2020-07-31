import java.util.Scanner;


class Solution {

	private static Scanner in = new Scanner(System.in);

	public static String gridSearch(String[] G, String[] P) {
        
		for (int i=0;i<G.length;i++) {
            int j = 0; 

            if (G[i].contains(P[j])) {
                int pos = G[i].indexOf(P[j]);

                while (pos >= 0) {
                    int temp1 = i + 1;
                    int temp2 = j + 1;
                    
                    while (temp1 < G.length & temp2 < P.length) {
                        int pos1 = G[temp1].indexOf(P[temp2]);
                        while (pos1 >= 0){
                            if (pos == pos1) break;
                            pos1 = G[temp1].indexOf(P[temp2], pos1+1);
                        }
                        if (pos != pos1) break;
                        temp1++;temp2++;
                    }
                    if (temp2 == P.length) {
                        return "YES";
                    }
                    pos = G[i].indexOf(P[j] , pos+1);
                }
            }
        }
        return "NO";
    }

	public static void printStringArray(String[] arr){
		System.out.println(arr.length);
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int t = in.nextInt();
		while(t>0) {
			int R = in.nextInt();
			int C = in.nextInt();

			in.nextLine();

			String[] s1 = new String[R];

			for (int i=0;i<R;i++) {
				s1[i] = in.nextLine();
			}

			int r = in.nextInt();
			int c = in.nextInt();

			in.nextLine();
			String[] s2 = new String[r];

			for (int i=0;i<r;i++) {
				s2[i] = in.nextLine();
			}		
			System.out.println(gridSearch(s1,s2));
			t--;
		}
	}
}