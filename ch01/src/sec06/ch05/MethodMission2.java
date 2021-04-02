package sec06.ch05;

import javax.swing.plaf.basic.BasicSplitPaneDivider;

public class MethodMission2 {

	public static void main(String[] args) {
		int n1=10,n2=3;
		double result=divide(n1,n2);
		System.out.printf("result: %f\n",result);
		n2=5;
		result=divide(n1,n2);
		System.out.printf("result: %f\n",result);
		
		
		
		System.out.println("절댓값: "+abs(10));
		System.out.println("절댓값: "+abs(-10));
		}

	private static int abs(int i) {
		return (i>0)?i:-i;
	}

	private static double divide(int i, int j) {
		return (double)i/j;
	}

}
