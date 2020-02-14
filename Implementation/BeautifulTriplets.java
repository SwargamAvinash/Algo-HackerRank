import java.util.Scanner;

class Solution{
    private static Scanner in = new Scanner(System.in);


    public static boolean findKBS(int key,int start,int a[],int end){
        if(start > end) return false;
        int mid = start + ((end -start)/2);

		// System.out.println(mid);
        if(key > a[mid]) return findKBS(key,mid+1,a,end);
        else if(key < a[mid]) return findKBS(key,start,a,mid-1);
		return true;
    }

    public static int printTripletCount(int n,int d,int a[]){
        int count = 0;

        if((a[n-1] - a[0]) <= d) return count;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((a[j] - a[i] == d) && findKBS(d+a[j],j+1,a,n-1)){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args){
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];

        for(int i=0;i<n;i++){
            a[i] = in.nextInt();
        }
        System.out.println(printTripletCount(n,d,a));
    }
}