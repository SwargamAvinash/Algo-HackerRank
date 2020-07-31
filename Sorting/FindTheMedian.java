import java.util.Scanner;
import java.util.Arrays;

// I guess I have to use sorting Algorithm...

class Solution{
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        int n = in.nextInt();
        int[] a = new int[n];
         for(int i=0;i<n;i++){
             a[i] = in.nextInt();
        }
        Arrays.sort(a);

        System.out.println(a[n/2]);
    }
}