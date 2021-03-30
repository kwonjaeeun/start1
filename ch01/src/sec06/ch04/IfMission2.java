package sec06.ch04;
import java.util.*;
public class IfMission2 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		final int MAN_STAND = 176;
		final int WOMAN_STAND = 163;
		int stand=MAN_STAND;
		String disgender="남자";
		String disresult="평균";
		
		while(true) {
			stand=MAN_STAND;
			disgender="남자";
			disresult="평균";
			String gender =scan.next();
			int height = scan.nextInt();
			if(gender.equals("남")||gender.equals("여")) {
				if(gender.equals("여")) {
					stand=WOMAN_STAND;
					disgender="여자";
				}
				if(height>stand) {
					disresult+="초과";
				}else if(height<stand) {
					disresult+="미만";
				}
				System.out.println("성별:"+disgender+"\n키:"+height+"\n"+disresult);
			}else {
				System.out.println("측정불가");
			}
		}
	}
	
		
	
}
