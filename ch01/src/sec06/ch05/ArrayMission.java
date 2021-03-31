package sec06.ch05;

public class ArrayMission {

	public static void main(String[] args) {
		int len=10;
		int[] intArr = new int[len];
		for(int i=0;i<10;i++) {
			intArr[i]=20;
		}	
		for(int i=0;i<10;i++) {		
			System.out.printf("intArr[%d] : %d\n",i,intArr[i]);
		}	
	}

}
