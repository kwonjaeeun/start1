package sec06.ch04;

public class WhileMission3 {

	public static void main(String[] args) {
		int val=0,sum=0;
		do { 
			val=(int)(Math.random()*11);
			System.out.println("val값: " +val);
			sum+=val;
		} while(val!=0);
		System.out.println("do while-sum값: "+sum);
	}

}
