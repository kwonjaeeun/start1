package sec06.ch04;

public class ForMission3 {

	public static void main(String[] args) {
		int star=(int)(Math.random()*6)+5;
		System.out.println("star : "+star);
		for(int i=0;i<star;i++) {
			System.out.print("*");
		}
		
		System.out.println("\nstar : "+star);
		for(int i=0;i<star;i++) {
			for(int j=0;j<=i;j++)
				System.out.print("*");
			System.out.println();
		}
	}

}
