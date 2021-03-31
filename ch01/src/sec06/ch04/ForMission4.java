package sec06.ch04;

public class ForMission4 {

	public static void main(String[] args) {
		int dan=(int)(Math.random()*8)+2;
		for(int i=6;i<15;i++) {
			int j=i-5;
			System.out.println(dan+" * "+j+" = "+dan*j);
		}
		System.out.println();
		for(int i=1;i<=9;i++) {
			System.out.printf("%d * %d = %d\n",dan,i,dan*i);
		}
	}
}


