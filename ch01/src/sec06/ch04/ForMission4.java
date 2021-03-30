package sec06.ch04;

public class ForMission4 {

	public static void main(String[] args) {
		int dan=(int)(Math.random()*8)+2;
		for(int i=1;i<=9;i++) {
			System.out.println(dan+" * "+i+" = "+dan*i);
		}
		System.out.println();
		for(int i=1;i<=9;i++) {
			System.out.printf("%d * %d = %d\n",dan,i,dan*i);
		}
	}
}


