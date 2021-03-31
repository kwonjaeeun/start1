package sec06.ch05;

public class ArrayMission2 {

	public static void main(String[] args) {
		int len=10;
		int[] intArr = new int[len];
		for(int i=0;i<intArr.length;i++) {
			intArr[i]=i+1;
		}	
		for(int i=0;i<intArr.length;i++) {		
			System.out.printf("intArr[%d] : %d\n",i,intArr[i]);
		}
	}

}