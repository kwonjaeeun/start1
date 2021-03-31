package sec06.ch04;

public class LabelLoopMission {

	public static void main(String[] args) {
		OUTER:
		for(int n1=1;n1<=9;n1++) {
			for(int n2=0;n2<=9;n2++) {
				if(n1==n2) {
					if(n1==8&&n2==8) {
						break OUTER;
						}
					System.out.println();
					continue OUTER;
				}
				System.out.printf("%d%d\n",n1,n2);
			}
		}
		
	}

}
