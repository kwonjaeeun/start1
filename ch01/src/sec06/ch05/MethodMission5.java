package sec06.ch05;

public class MethodMission5 {

	public static void main(String[] args) {
		int star= 5;//(int)(Math.random()*5)+1;
		printStarTri(star);
		System.out.println();
		star= 3;
		printStarTri(star);
		}
	public static void printStarLine(int star) {
	
		for(int i=0;i<star;i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	public static void printStarSquare(int star) {
		for(int i=0;i<star;i++) {
			printStarLine(star);
		}
	}
	public static void printStarTri(int star) {
		for(int i=1;i<=star;i++) {
			printStarLine(i);
		}
	}
	
	
	

}
