package sec06.ch04;

public class SwitchMission3 {

	public static void main(String[] args) {
		int season =(int)(Math.random()*12)+1;
		System.out.println(season+"월");
		switch(season) {
		case 12:case 1:case 2:
			System.out.println("겨율");
			break;
		case 3:case  4:case 5:
			System.out.println("봄");
			break;
		case 6: case 7:case 8:
			System.out.println("여름");
			break;
		case 9:case  10:case 11:
			System.out.println("가을");
			break;
		}
	}

}
