package sec06.ch04;

public class ForMission9 {

	public static void main(String[] args) {
		int star=(int)(Math.random()*5)+3;
		System.out.println(star);
		for(int i=star;i>0;i--) {
			for(int z=0;z<i;z++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
	}

}
