import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

class Solution{
	private static Scanner in = new Scanner(System.in);

	public static Map<Integer,String> initiate(){
		Map<Integer,String> numberToEng = new HashMap<Integer,String>();

		numberToEng.put(0,"zero");
		numberToEng.put(1,"one");numberToEng.put(16,"sixteen");
		numberToEng.put(2,"two");numberToEng.put(17,"seventeen");
		numberToEng.put(3,"three");numberToEng.put(18,"eighteen");
		numberToEng.put(4,"four");numberToEng.put(19,"nineteen");
		numberToEng.put(5,"five");numberToEng.put(20,"twenty");
		numberToEng.put(6,"six");numberToEng.put(21,"twenty one");
		numberToEng.put(7,"seven");numberToEng.put(22,"twenty two");
		numberToEng.put(8,"eight");numberToEng.put(23,"twenty three");
		numberToEng.put(9,"nine");numberToEng.put(24,"twenty four");
		numberToEng.put(10,"ten");numberToEng.put(25,"twenty five");
		numberToEng.put(11,"eleven");numberToEng.put(26,"twenty six");
		numberToEng.put(12,"twelve");numberToEng.put(27,"twenty seven");
		numberToEng.put(13,"thirteen");numberToEng.put(28,"twenty eight");
		numberToEng.put(14,"fourteen");numberToEng.put(29,"twenty nine");
		numberToEng.put(15,"fifteen");numberToEng.put(30,"thirty");

		return numberToEng;
	}

	public static String printEng(int h,int m){
		Map<Integer,String> numberToEng = initiate();
		String engString = "";
		if(m == 0){
			engString = numberToEng.get(h) + " o' clock";
		}else if(m>0 && m<=1){
			engString = numberToEng.get(m) + " minute past " + numberToEng.get(h);
		}else if(m>1 && m<15){
			engString = numberToEng.get(m) + " minutes past" + numberToEng.get(h);
		}else if(m == 15){
			engString = "quarter past " + numberToEng.get(h);
		}else if(m>15 && m<30){
			engString = numberToEng.get(m) +" minutes past "+ numberToEng.get(h);
		}else if(m == 30){
			engString = "half past " + numberToEng.get(h);
		}else if(m>30 && m<45){
			engString = numberToEng.get(60 - m) + " minutes to " + numberToEng.get(h+1);
		}else if(m == 45){
			engString = "quarter to " + numberToEng.get(h+1);
 		}else if(m>45 && m<59){
			 engString = numberToEng.get(60 - m) + " minutes to " + numberToEng.get(h+1);
		}else if(m == 59){
			 engString = numberToEng.get(60 - m) + " minute to " + numberToEng.get(h+1);
		}
		return engString;
	}

	public static void main(String[] args){
		int h = in.nextInt();
		int min = in.nextInt();
		System.out.println(printEng(h,min));
	}
}