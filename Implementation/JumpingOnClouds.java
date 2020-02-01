import java.util.Scanner;

class Solution{
    private static Scanner  in = new Scanner(System.in);

    public static void main(String[] args){
        int n,k,rounds,initial_e;
        n = in.nextInt();
        k = in.nextInt();
        int[] e = new int[n];
        initial_e = 100;

        for(int i=0;i<n;i++){
            e[i] = in.nextInt();
        }
        if (k % n == 0){
            rounds = 1;
        }else{
            rounds = (n % k == 0) ? (n/k) : n;
        }
        int start = 0;
        for(int i=1;i<=rounds;i++){
            start = ( start + k ) % n;
            initial_e = (e[start] == 1) ? (initial_e - 3) : (initial_e - 1);
        }
        System.out.println(initial_e);
    }
}