import java.util.Scanner;
import java.lang.*;

class Solution{
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        int d1,m1,y1,d2,m2,y2;
        d1 = in.nextInt();
        m1 = in.nextInt();
        y1 = in.nextInt();
        d2 = in.nextInt();
        m2 = in.nextInt();
        y2 = in.nextInt();

        if (Math.abs(y1 - y2) != 0){
			if(y1 > y2) System.out.println(10000);
			else System.out.println(0);
        }
        else if(Math.abs(m1 - m2) != 0){
			if(m1 > m2) System.out.println(500 * (m1-m2));
			else System.out.println(0);
        }else if(Math.abs(d1-d2) != 0){
			if(d1 > d2)  System.out.println(15 * (d1-d2));
			else System.out.println(0);
        }else{
            System.out.println(0);
        }
    }
}