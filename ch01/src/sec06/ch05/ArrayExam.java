package sec06.ch05;

public class ArrayExam {

	public static void main(String[] args) {
		int len=300;
		int[] intArr = new int[len];
		System.out.println("intArr[1]:"+intArr[1]);
		System.out.println("--------------------------------");
		int[] intArr2= {10,20,30};
		for(int i=0;i<3;i++) {
			System.out.printf("intArr2[%d] : %d\n ",i,intArr2[i]);
		}
	}

}
