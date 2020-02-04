import java.util.Scanner;
import java.lang.*;

class Solution{
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        int t = in.nextInt();
        while(t>0){
            int a,b;
            a = in.nextInt();
            b = in.nextInt();

            int count = 0;
			int squares = (int)(Math.sqrt(a));
            if((squares * squares) == a) {
                count++;
            }
			squares++;
            while ((squares * squares)<= b){
                count++;
                squares ++;
            }
            System.out.println(count);
            t--;
        }
    }
}