import java.util.Scanner;
import java.lang.*;

class Solution {
    private static Scanner in = new Scanner(System.in);


    public static boolean isKaprekarNumber(long n){
        int digits = (int) (Math.log10(n) + 1);
        // System.out.println("Digits :: " + digits);
        String squareString = String.valueOf(n * n);

        if(squareString.length() < 2){
            if(n == Integer.valueOf(squareString).intValue()) return true;
            else return false;
        }

        // System.out.println(squareString+" First Part :: " + squareString.substring(0,digits));
        // System.out.println("Secound Part :: " + squareString.substring(digits,squareString.length()));
        Integer sum;
        if(digits*2 == squareString.length()){
            sum = Integer.valueOf( squareString.substring(0,digits) ) + Integer.valueOf(squareString.substring(digits,squareString.length()));
        }else{
            sum = Integer.valueOf( squareString.substring(0,digits-1) ) + Integer.valueOf(squareString.substring(digits-1,squareString.length()));
        }
        if (n == sum.intValue()) return true;
        return false;
    }

    public static void main(String[] args){
        long start = in.nextInt();
        long end = in.nextInt();
        long count = 0;
        for(long i = start ;i<=end;i++){
            if(isKaprekarNumber(i)){
                count++;
                System.out.print(i + " ");
            }
        }
        if(count == 0) System.out.println("INVALID RANGE");
    }
}