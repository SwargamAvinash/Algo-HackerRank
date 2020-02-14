import java.util.Scanner;


// Could have gone for simple Appraoch didn't want to use count extra variable..
// which screwed some 

class Solution{
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        int p = in.nextInt();
        int d = in.nextInt();
        int m = in.nextInt();

        int total = in.nextInt();
        int i = 0;
        int temp_price  = p;

		if(total < temp_price){
			System.out.println(0);
		}else{
			for(i=0;total>temp_price;i++){
				temp_price = p - i*d;
				if(temp_price > m){
					total -= temp_price;
				}else{
					break;
				}
			}
			if(temp_price <= m){
				int r = total/m;
				i = i + r;
			}
			System.out.println(i);
		}
    }
}