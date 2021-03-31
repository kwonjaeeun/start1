package sec06.ch04;

public class WhileMission2 {

	public static void main(String[] args) {
		int sum=0;
		int val=(int)(Math.random()*11);
		System.out.println("val값: " +val);
		while(val!=0) {
		sum+=val;
		val=(int)(Math.random()*11);
		System.out.println("val값: " +val);
		}
		System.out.println("sum값: "+sum);
	}

}
