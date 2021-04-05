package sec06.ch05;

import java.util.Scanner;

public class MethodMission7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer=null;
		do {
		System.out.println("성별: ");
		String gender = scan.next();
		
		System.out.println("키:");
		int height = scan.nextInt();
		String result= chk(gender,height);
		System.out.println(result);
		System.out.println("계속 하시겠습니까?");
		answer=scan.next();
		}while(answer.equals("y"));
		System.out.println("끝");
		scan.close();
	}

	public static String chk(String gender, int height) {
		final int MAN_STAND = 176;
		final int WOMAN_STAND = 163;
		int stand=MAN_STAND;
		String result="평균";
		if(gender.equals("남")||gender.equals("여")) {
			if(gender.equals("여")) {
				stand=WOMAN_STAND;
			}
			if(height>stand) {
				result+="초과";
			}else if(height<stand) {
				result+="미만";
			}
		}else {
			return "측정불가";
		}
		
		return "성별:"+gender+", 키: "+height+","+result;
	}
	


}
