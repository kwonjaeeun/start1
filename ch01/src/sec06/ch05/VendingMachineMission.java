package sec06.ch05;

import java.util.Scanner;

public class VendingMachineMission {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String[] menu= {"콜라","사이다 ","환타","스프라이트","망고주스"};
		int[] menuPriceArr={1000,1200,1300,1500,2000};
		int[] menuCount= new int[5];
		int pay=0;
		Menu n_menu= new Menu(menu,menuPriceArr,menuCount);
		System.out.printf("돈을 지불하여 주십시오>>>");
		pay=scan.nextInt();
		System.out.printf("(투입 금액:%d)\n",pay);
		System.out.println("<메뉴>");
		for(int i=0;i<n_menu.name.length;i++) {
			System.out.printf("%d. %s (%,d)\n",i+1,n_menu.name[i],n_menu.price[i]);
		}
		while(true) {
		
			System.out.println("선택>");
			int choice=scan.nextInt();
			if(choice==0) {
				for(int i=0;i<n_menu.name.length;i++) {
					if(n_menu.count[i]!=0) {
						System.out.printf("%s :%d개\n",n_menu.name[i],n_menu.count[i]);
						}
				}
				System.out.printf("총 지불한 금액은 %d입니다\n거스름돈은 %,d 입니다.\n",n_menu.Result(),pay);

				break;
			}else if(choice<0||choice>n_menu.name.length) {
				System.out.println("잘못 선택하셨습니다\n");
				continue;
			}
			int index=choice-1;
			if(pay-n_menu.price[index]>=0) {
				pay-=n_menu.price[index];
				System.out.printf(n_menu.name[index]+"를 선택하셨습니다.(남은금액 %,d)\n",pay);
				n_menu.count[index]++;
			}else{
				System.out.printf("금액이 부족합니다.(남은금액 %,d)\n",pay);
			}
			
			
		}
		System.out.println("종료");
		scan.close();

//		System.out.printf("돈을 지불하여 주십시오>>>(지불할 금액:%d/현재 투입 금액:%d)\n",n_menu.result,pay);
//		pay+=scan.nextInt();
//		for(int z=0;z<n_menu.result;z=pay) {
//			System.out.printf("돈을 더 지불하여 주십시오>>>(지불할 금액:%d/현재 투입 금액:%d)\n",n_menu.result,pay);
//			pay+=scan.nextInt();
//		}
//		System.out.printf("거래가 완료 되었습니다.\n거스름돈은:%d입니다\n",pay-n_menu.result);
		
	}

}
