package sec06.ch05;

public class MethodMission {

	public static void main(String[] args) {
		whoIsBig(10,30,100);
		whoIsBig(10,9,3);
		whoIsBig(11,25,1);
		System.out.println("-----------------------------");
		int big= getBignum(10,30);
		System.out.println("big: " + big);
		big=getBignum(10,9);
		System.out.println("big: " + big);
		System.out.println("-----------------------------");
		
		bigger(10,30,100);
		bigger(10,9,3);
		bigger(11,25,1);
		}
	private static int getBignum(int i, int j) {
		return (i>j)?i:j;
	}
	public static void whoIsBig(int a,int b, int c) {
		System.out.printf("%d이(가) 가장 큽니다\n",(a>b)?(a>c)?a:c:(b>c)?b:c);
		
	}
	//overloading연습
	public static void bigger(int a , int b,int c) {
		System.out.printf("%d이(가) 가장 큽니다\n",bigger(bigger(a,b),c));
	}
	
	public static int bigger(int a , int b) {
		return(a>b)?a:b ;
	}
}
