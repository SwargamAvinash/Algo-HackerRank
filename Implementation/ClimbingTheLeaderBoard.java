import java.util.Scanner;

class Solution{


	// The Below function gets the position where to be inserted.
	public int getPositionUsingBS(int scores[],int num,int l,int r){
		if (r <= l) return l;
		int mid = l + ((r - l) / 2); // Need to know why we do this forgot.
		if (num > scores[mid]){
			return getPositionUsingBS(scores,num,l,mid-1);
		}else if (num < scores[mid]){
			return getPositionUsingBS(scores,num,mid+1,r);
		}else{
			return mid;
		}
	}
	

	public void printRankOfEachGame(int scores[] , int alice[],int m,int n){
		// Need to find the present Ranking's of the scores.
		int rankings[] = new int[m];
		rankings[0] = 1;
		for (int i=1;i<m;i++){
			if(scores[i] == scores[i-1]){
				rankings[i] = rankings[i-1];
			}else{
				rankings[i] = rankings[i-1] + 1;
			}
		}

		int posi = m-1;
		for(int i=0;i<n;i++){
			posi = getPositionUsingBS(scores,alice[i],0,posi); //More optimization.
			if(scores[posi] <= alice[i]){
				System.out.println(rankings[posi]);
			}else{
				System.out.println(rankings[posi]+1);
			}
		}
	}

	public static void main(String[] args){
		int n,m;
		Scanner in = new Scanner(System.in);

		m = in.nextInt();
		int scores[] = new int[m];
		for (int i=0;i<m;i++){
			scores[i] = in.nextInt();
		}

		n = in.nextInt();
		int alice[] = new int[n];
		for (int i=0;i<n;i++){
			alice[i] = in.nextInt();
		}

		Solution ans = new Solution();
		ans.printRankOfEachGame(scores,alice,m,n);
	}
}