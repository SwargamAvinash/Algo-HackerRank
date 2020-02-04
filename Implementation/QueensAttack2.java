import java.util.Scanner;
import java.lang.*;
import java.util.Arrays;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

/* 
	Retry File for this Problem That is the Solution 
	Problem Over Thought.. 
	1) My Approach was get All the possible move positions and eliminate the positions 
	that are blocked by the Obstacles.. !!
	2) Took a toll on the Complexity and Space..

	Better Approach would is --> 
	1) If you know the closest obstacles in all 8 directions then it will be very easy to calculate 
	the UnBlocked Blocks that Queen can move.

	2) Just Keep Track of all the Obstacles which are closest in All 8 Directions.. Easy one.! 
*/


class Solution {
	private static Scanner in = new Scanner(System.in);

	private static int theBoxesQueenCanMove(int n,int rq,int cq){
		int boxes = 2*(n-1); // A complete row and A complete column where ever they might be.

		// Top Left Diagnol boxes... (1,n)
		boxes += Math.min(Math.abs(rq - 1) , Math.abs(cq - n));

		// Bottom Left Diagnol boxes .. (1,1)
		boxes += Math.min(Math.abs(rq - 1) , Math.abs(cq - 1));

		// Top right Diganol Boxes.. (n,n)
		boxes += Math.min(Math.abs(rq - n) , Math.abs(cq - n));
		
		//Bottom Right Diagonal Boxes.. (n,1)
		boxes += Math.min(Math.abs(rq - n) , Math.abs(cq - 1));

		return boxes;
	}


	private static int theBoxesBlocked(int n,int r_obs,int c_obs,int rq,int cq,List<Point> blockedPoints){
		int boxesBlocked = 0;
		int rowDiff = rq - r_obs;
		int colDiff = cq - c_obs;

		if(rowDiff == 0){
			boxesBlocked += ((cq > c_obs) ? (c_obs - 1 + 1) : (n - c_obs + 1));
			if(cq > c_obs){
				for (int i=c_obs;i>=1;i--) blockedPoints.add(new Point(rq,i));
			}else{
				for (int i=c_obs;i<=n;i++) blockedPoints.add(new Point(rq,i));
			}
		}else if(colDiff == 0){
			boxesBlocked += ((rq > r_obs) ? (r_obs - 1 + 1) : (n - r_obs + 1));
			if(rq > r_obs){
				for (int i=r_obs;i>=1;i--) blockedPoints.add(new Point(i,cq));
			}else{
				for (int i=r_obs;i<=n;i++) blockedPoints.add(new Point(i,cq));
			}
		}else if(Math.abs(rowDiff) == Math.abs(colDiff)){
			int x = ((r_obs > rq) ? (n - r_obs) : (r_obs - 1));
			int y = ((c_obs > cq) ? (n - c_obs) : (c_obs - 1));
			int temp = Math.min(x,y);
			boxesBlocked += (temp + 1);
			if(r_obs > rq && c_obs > cq){
				for(int i=0;i<=temp;i++) blockedPoints.add(new Point(r_obs+i,c_obs+i));
			}else if(r_obs > rq && c_obs < cq){
				for(int i=0;i<=temp;i++) blockedPoints.add(new Point(r_obs+i,c_obs-i));
			}else if(r_obs < rq && c_obs < cq){
				for(int i=0;i<=temp;i++) blockedPoints.add(new Point(r_obs-i,c_obs-i));
			}else if(r_obs < rq && c_obs > cq){
				for(int i=0;i<=temp;i++) blockedPoints.add(new Point(r_obs-i,c_obs+i));
			}
		}
		// System.out.println("The boxes blocked for x: " + r_obs + " y: " + c_obs + " ==> " + boxesBlocked);
		return boxesBlocked;
	}

	// Checking not to add Multiple Blocked Blocks..
	public static boolean notPresentObs(List<Point> blockedPoints,int r_obs,int c_obs){
		// System.out.println("The size of the BlockedPoints :: \t" + blockedPoints.size());
		// System.out.println(blockedPoints);
		Point po = new Point(r_obs,c_obs);
		// System.out.println(po);
		boolean size = blockedPoints.stream().anyMatch(p -> p.equals(po));
		// System.out.println("The size after filter :: " + size);
		return (!size);
	}

	public static void main(String[] args){
		
		int n = in.nextInt();
		int k = in.nextInt();

		int rq = in.nextInt();
		int cq = in.nextInt();

		int ans_count = theBoxesQueenCanMove(n,rq,cq);

		List<Point> blockedPoints = new ArrayList<Point>();
		for(int i=0;i<k;i++){
			int r_obs = in.nextInt();
			int c_obs = in.nextInt();
			// Also Need one more Check if that Blocked Block is being counted again.. 
			if(notPresentObs(blockedPoints,r_obs,c_obs)){
				ans_count -= theBoxesBlocked(n,r_obs,c_obs,rq,cq,blockedPoints);
			}
		}
		System.out.println(ans_count);
	}
}