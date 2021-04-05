package sec06.ch05;

public class MethodMission8 {

	public static void main(String[] args) {
		//gugudan(8);
		gugudan(4,9);
	}
	public static void gugudan(int i, int j) {
		for(int z=i;z<=j;z++) {
			gugudan(z);
		System.out.println("----------------------");
		}
		
	}
	public static void gugudan(int i) {
		for(int z=1;z<10;z++)
			System.out.println(i+"*"+z+"="+i*z);
	}
}
