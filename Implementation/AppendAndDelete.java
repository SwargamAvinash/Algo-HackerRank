import java.util.Scanner;

class Solution{
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        String s1,s2;
        s1 = in.nextLine();
        s2 = in.nextLine();
        int k = in.nextInt();
        
        int i = 0;
        while(i < s1.length() && i < s2.length()){
            if(s1.charAt(i) == s2.charAt(i)){
                i++;
            }else {
                break;
            }
        }
        int r1 = (s1.length() - i) < 0 ? 0 : (s1.length() - i);
        int r2 = (s2.length() - i) < 0 ? 0 : (s2.length() - i);

        if ((k - (r1 + r2)) == 0) System.out.println("Yes");
        else if((k - (r1 + r2)) > 0){
            int temp = (k - (r1 + r2));
            if(temp % 2 == 0) System.out.println("Yes");
            else if(temp %2 !=0 && temp == 2 * i) System.out.println("Yes");
            else System.out.println("No");
        }else System.out.println("No");
    }
}