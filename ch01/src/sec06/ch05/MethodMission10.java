package sec06.ch05;

import java.util.Scanner;

public class MethodMission10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] menuNmArr = { "콜라", "사이다", "환타", "스프라이트", "망고주스", "포도주스" };
		int[] menuPriceArr = { 1000, 1200, 1300, 1500, 2000, 3000 };
		Drink[] drinkArr=new Drink[6];
		for(int i=0;i<drinkArr.length;i++) {
			Drink d=new Drink();
			d.nm=menuNmArr[i];
			d.price=menuPriceArr[i];
			drinkArr[i]=d;
		}
		printMenu(drinkArr);
		
	}

	public static void printMenu(Drink[] d) { 
		String str="<메뉴>\n"; 
		str+="0.종료\n";
		for(int i=0;i<d.length;i++) {
			str+=String.format("%d. %s (%,d원)\n",i+1, d[i].nm,d[i].price); }
			System.out.println(str); 
		}
	
}

