package sec06.ch05;

public class MethodMission6 {

	public static void main(String[] args) {
		int score= getRandomScore(50,100);
		char grade= getGrade(score);
		char grade2= getGrade2(score);
		System.out.printf(" %d : %c%c\n",score,grade,grade2);
	}

	
	public static char getGrade(int score) {
		if(score>=90)
			return 'A';
		else if(score>=80)
			return 'B';
		else if(score>=70)
			return 'C';
		else if(score>=60)
			return 'D';
		else 
			return 'E';
	}
	
	public static char getGrade2(int score) {
		int mod_score=score%10;
		if(mod_score>=8||score==100) return '+';
		else if(mod_score<=3) return '-';
		return ' ';
	}

	public static int getRandomScore(int min, int max) {
		return (int)(Math.random()*(max-min+1))+min;
	}
	

}
