import java.util.Scanner;
import java.util.Arrays;
import java.lang.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections; //This is the Library for all the Collections.
import java.util.Comparator;

class TractInput{
	int row;
	int c1;
	int c2;
}

class Solution{

    private static Scanner in = new Scanner(System.in);

    private static void printMatrix(ArrayList<TractInput> tracks){
		for(int i=0;i<tracks.size();i++){
			System.out.println(tracks.get(i).row + " -- " + tracks.get(i).c1 + " -- "+ tracks.get(i).c2);
		}
    }

    // private static void numberOfLampPosts(ArrayList<TractInput> tracks, int n, int m, int k){
    //     BigInteger numberOfLampPosts = BigInteger.valueOf(0);
    //     BigInteger B_n = BigInteger.valueOf(n);
    //     BigInteger B_m = BigInteger.valueOf(m);



    //     for(int i=0;i<k;i++){
    //         int row = matrix[i][0]-1;
    //         int c1 = matrix[i][1]-1;
    //         int c2 = matrix[i][2]-1;
    //         for (int j=Math.min(c1,c2) ; j<=Math.max(c1,c2);j++){
    //            if(city[row][j] != 1){
    //                 city[row][j] = 1;
    //                 numberOfLampPosts.add(BigInteger.valueOf(1));
    //             }
    //         }
    //     }
    //     System.out.println((B_n.multiply(B_m)).subtract(numberOfLampPosts));
    // }

    public static void main(String[] args) {
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();

        ArrayList<TractInput> tracks = new ArrayList<TractInput>(k);
        for(int i=0;i<k;i++){
			TractInput track = new TractInput();
			track.row = in.nextInt();
			track.c1 = in.nextInt();
			track.c2 = in.nextInt();
			tracks.add(track);	
        }
		
		Collections.sort(tracks,new Comparator<TractInput>(){
			@Override
			public int compare(TractInput t1, TractInput t2){
				int comp = t1.row - t2.row;
				if(comp != 0) return comp;
				else{
					int comp1 = t1.c1 - t2.c1;
					if(comp1 != 0) return comp1;
					else return t1.c2 - t2.c2; 
				}
			}
		});
		printMatrix(tracks);
        // numberOfLampPosts(tracks, n, m, k);
    }
}