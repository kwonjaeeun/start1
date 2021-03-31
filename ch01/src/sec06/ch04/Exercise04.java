package sec06.ch04;
public class Exercise04 {
	public static void main(String[] args) {
	
		while(true) {
			int d1=(int)(Math.random()*6)+1;
			int d2=(int)(Math.random()*6)+1;
			int sum= d1+d2;
			System.out.printf("(%d, %d): %d\n",d1,d2,sum);
			if(sum==5) {
				break;
			}
		}
		System.out.println("끝");
	}
}
