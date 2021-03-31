package sec06.ch04;

public class ForMission8 {

	public static void main(String[] args) {
		int star=(int)(Math.random()*5)+3;
		System.out.println(star);
		System.out.println("1번");
		for(int i=1;i<=star;i++) {
			for(int z=star;z>0;z--) {
				System.out.printf(i>=z?"*":"_");
			}
			System.out.println();
		}
		System.out.println("2번");
		for(int i =1; i<=star;i++) {
			for(int z=star;z>i;z--) {
				System.out.print("_");
			}
			for(int z=0;z<i;z++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		System.out.println("3번");
		for(int i =1; i<=star;i++) {
			for(int z=star;z>0;z--) {
				if(i>=z) {
					System.out.print("*");
				}else {
					System.out.print("_");
				}
			}
			
			System.out.println();
			
		}
	}
	

}
