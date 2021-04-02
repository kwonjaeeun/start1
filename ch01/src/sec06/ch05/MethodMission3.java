package sec06.ch05;

import javax.swing.plaf.basic.BasicSplitPaneDivider;

public class MethodMission3 {

	public static void main(String[] args) {
		
		sumAllFromTo(5, 10);
		sumAllFromTo(4, 2);
		sumAllFromTo(2, 4);
		sumAllFromTo(1, 100);
		System.out.println(sumAllFromTo2(5, 10));
		System.out.println(sumAllFromTo2(4, 2));;
		System.out.println(sumAllFromTo2(2, 4));
		System.out.println(sumAllFromTo2(1, 100));
		}

	public static int sumAllFromTo2(int n1, int n2) {
		return (n2>n1)?((n2-n1+1)*(n1+n2)>>1):((n1-n2+1)*(n1+n2)>>1);
			}
	public static void sumAllFromTo(int n1,int n2) {
		int sum=0;
		int no1=(n1>n2)?n2:n1,no2=(n1>n2)?n1:n2;
		for(int i=no1;i<=no2;i++) {
			sum+=i;
			}
		System.out.println("sum: "+sum);
	}

}
