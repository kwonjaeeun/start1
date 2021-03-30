package sec06.ch04;

public class IfMission3 {
	public static void main(String[] args) {
		final int SCORE=(int)(Math.random()*20)+81;
		System.out.println("SCORE: "+SCORE);
		final int ACC=90;
		final int BCC=80;
		final int PCL=7;
		final int NCL=4;
		final int MCL=1;
		String grade="";
	
		if(SCORE>ACC) {
			grade="A";
			int score=SCORE%ACC;
			if(score>=PCL) {
				grade+="+";
			}else if(score>=NCL){
				grade+="";
			}else if(score>=MCL){
				grade+="-";
			}
		}
		else if(SCORE>BCC) {
			grade="B";
			int score=SCORE%BCC;
			if(score>=PCL){
				grade+="+";
			}else if(score>=NCL){
				grade+="";
			}else if(score>=MCL){
				grade+="-";
			}
		}
		System.out.println(grade);
		
		
	}
}
