import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.lang.*;

import java.awt.Point;

/* 
	Directions -> Shortcut
	TopLeft -> TL
	TopRight -> TR
	DownLeft -> DL
	DownRight -> DR

	Top -> T
	Down -> D
	Left -> L
	Right -> R

*/


class Solution {
	private static Scanner in = new Scanner(System.in);


	public static Map<String,Point> initialize(){
		Map<String,Point> obsClose = new HashMap<String,Point>();
		obsClose.put("T",new Point(-1,-1));
		obsClose.put("D",new Point(-1,-1));
		obsClose.put("L",new Point(-1,-1));
		obsClose.put("R",new Point(-1,-1));
		obsClose.put("TL",new Point(-1,-1));
		obsClose.put("TR",new Point(-1,-1));
		obsClose.put("DR",new Point(-1,-1));
		obsClose.put("DL",new Point(-1,-1));
		return obsClose;
	}

	public static void obstacleCloseRetainer(int rq,int cq,int r_obs,int c_obs,Map<String,Point> obsClose){
		int rowDiff = rq - r_obs;
		int colDiff = cq - c_obs;
		Point temp;
		if(rowDiff == 0 && c_obs > cq){  //Top Direction
			temp = obsClose.get("T");
			if(temp.getY() == -1) temp.setLocation(rq,c_obs);
			else if(c_obs < temp.getY()) temp.setLocation(rq,c_obs);

		}else if(rowDiff == 0 && c_obs < cq){ //Down Direction
			temp = obsClose.get("D");
			if(temp.getY() == -1) temp.setLocation(rq,c_obs);
			else if(c_obs > temp.getY()) temp.setLocation(rq,c_obs);

		}else if(colDiff == 0 && r_obs > rq){ //Right Direction
			temp = obsClose.get("R");
			if(temp.getX() == -1) temp.setLocation(r_obs,cq);
			else if(r_obs < temp.getX()) temp.setLocation(r_obs,cq);

		}else if(colDiff == 0 && r_obs < rq){ //Left Direction
			temp = obsClose.get("L");
			if(temp.getX() == -1) temp.setLocation(r_obs,cq);
			else if(r_obs > temp.getX()) temp.setLocation(r_obs,cq);

		}else if(Math.abs(rowDiff) == Math.abs(colDiff)){
			if(r_obs > rq && c_obs > cq){ //Top Right Direction.
				temp = obsClose.get("TR");
				if(temp.getX() == -1 && temp.getY() == -1) temp.setLocation(r_obs,c_obs);
				else if(r_obs < temp.getX() && c_obs < temp.getY()) temp.setLocation(r_obs,c_obs);

			}else if(r_obs > rq && c_obs < cq){ // Down Right Direction
				temp = obsClose.get("DR");
				if(temp.getX() == -1 && temp.getY() == -1) temp.setLocation(r_obs,c_obs);
				else if(r_obs < temp.getX() && c_obs > temp.getY()) temp.setLocation(r_obs,c_obs);

			}else if(r_obs < rq && c_obs < cq){ // Down  Left Direction
				temp = obsClose.get("DL");
				if(temp.getX() == -1 && temp.getY() == -1) temp.setLocation(r_obs,c_obs);
				else if(r_obs > temp.getX() && c_obs > temp.getY()) temp.setLocation(r_obs,c_obs);

			}else if(r_obs < rq && c_obs > cq){ // Top Left Direction
				temp = obsClose.get("TL");
				if(temp.getX() == -1 && temp.getY() == -1) temp.setLocation(r_obs,c_obs);
				else if(r_obs > temp.getX() && c_obs < temp.getY()) temp.setLocation(r_obs,c_obs);

			}
		}
	}


	public static int countOfUnBlockedBoxes(Map<String,Point> obsClose,int rq,int cq,int n){
		int boxes = 0;
		Point temp;

		temp = obsClose.get("T");
		if(temp.getX() == -1 && temp.getY() == -1) boxes += (n-cq);
		else boxes += (temp.getY() - cq - 1);

		temp = obsClose.get("D");
		if(temp.getX() == -1 && temp.getY() == -1) boxes += (cq-1);
		else boxes += (cq - temp.getY() - 1);

		temp = obsClose.get("L");
		if(temp.getX() == -1 && temp.getY() == -1) boxes += (rq-1);
		else boxes += (rq - temp.getX() - 1);

		temp = obsClose.get("R");
		if(temp.getX() == -1 && temp.getY() == -1) boxes += (n-rq);
		else boxes += (temp.getX() - rq - 1);

		temp = obsClose.get("TR");
		if(temp.getX() == -1 && temp.getY() == -1) boxes += Math.min(Math.abs(rq - n) , Math.abs(cq - n));
		else boxes += Math.min((Math.abs(temp.getX() - rq)- 1),(Math.abs(temp.getY() - cq) - 1));

		temp = obsClose.get("DR");
		if(temp.getX() == -1 && temp.getY() == -1) boxes += Math.min(Math.abs(rq - n) , Math.abs(cq - 1));
		else boxes += Math.min((Math.abs(temp.getX() - rq)- 1),(Math.abs(temp.getY() - cq) - 1));

		temp = obsClose.get("DL");
		if(temp.getX() == -1 && temp.getY() == -1) boxes += Math.min(Math.abs(rq - 1) , Math.abs(cq - 1));
		else boxes += Math.min((Math.abs(temp.getX() - rq)- 1),(Math.abs(temp.getY() - cq) - 1));

		temp = obsClose.get("TL");
		if(temp.getX() == -1 && temp.getY() == -1) boxes += Math.min(Math.abs(rq - 1) , Math.abs(cq - n));
		else boxes += Math.min((Math.abs(temp.getX() - rq)- 1),(Math.abs(temp.getY() - cq) - 1));

		return boxes;
	}

	public static void main(String[] args){
		int n = in.nextInt();
		int k = in.nextInt();

		int rq = in.nextInt();
		int cq = in.nextInt();

		Map<String,Point> obsClose = initialize();
		for(int i=0;i<k;i++){
			int r_obs = in.nextInt();
			int c_obs = in.nextInt();
			//Need to keep Track of Closed Obstacle to the Queen..!! in each direction..
			obstacleCloseRetainer(rq,cq,r_obs,c_obs,obsClose);
		}
		// System.out.println(obsClose);
		System.out.println(countOfUnBlockedBoxes(obsClose,rq,cq,n));
	}
}