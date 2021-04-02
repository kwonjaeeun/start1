package sec06.ch05;

public class MethodMission4 {

	public static void main(String[] args) {
		
		int rNum=getRandomNum();
		System.out.println("rNum:"+rNum);
		
		int max=500;
		rNum=getRandomNum(max);
		System.out.println("rNum:"+rNum);
		System.out.println("------------------------------");
		rNum=getRandomNum(5,10);
		System.out.println("rNum:"+rNum);
		rNum=getRandomNum(10,20);
		System.out.println("rNum:"+rNum);
		}
	public static int getRandomNum(int min,int max) {
		return (int)(Math.random()*(max-min+1))+min;
	}
	public static int getRandomNum(int max) {
		return (int)(Math.random()*max);
	}

	public static int getRandomNum() {
		return (int)(Math.random()*10);
	}
	
	

}
