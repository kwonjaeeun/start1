package sec06.ch05;

import java.util.Scanner;

public class MethodMission10 {

	public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	String[] menuNmArr= {"콜라","사이다","환타","스프라이트","망고주스","포도주스"};
	int[] menuPriceArr= {1000,1200,1300,1500,2000,3000};
	printMenu(menuNmArr,menuPriceArr);
	/* printMenu2(menuNmArr,menuPriceArr); */
	System.out.println("선택>");
	}
	public static void printMenu(String[] menu,int[] price) {
		System.out.println("<메뉴>");
		for(int i=0;i<menu.length;i++) {
			System.out.printf("%d. %s (%d)\n",i+1,menu[i],price[i]);
		}
	}
	/*
	 * public static void printMenu2(String[] menu,int[] price) { String
	 * str="<메뉴>\n"; for(int i=0;i<menu.length;i++) {
	 * str+=String.format("%d. %s (%,d원)\n",i+1, menu[i],price[i]); }
	 * System.out.println(str); }
	 */
	
}
