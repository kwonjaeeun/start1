package sec06.ch04;

import java.util.Scanner;

public class Exercise7 {
	public static void main(String[] args) {
	
		boolean run =true;
		int balance = 0;
		Scanner scan =new Scanner(System.in);
		OUTER:
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1.예금 |2.출금 |3.잔고 |4.종료");
			System.out.println("------------------------------");
			System.out.println("선택>");
			int choice=scan.nextInt();
			switch(choice) {
			case 1:
				int plus;
				System.out.print("예금액:");
				plus= scan.nextInt();
				balance+=plus;
				break;
			case 2:
				int minus;
				System.out.print("출금액:");
				minus= scan.nextInt();
				balance-=minus;
				break;
			case 3:
				System.out.printf("잔고: %d\n",balance);
				break;
			case 4:
				break OUTER;
			default:
				System.out.printf("잘못된 입력값입니다");
			}
		}
		System.out.println("프로그램 종료");
	}
}
