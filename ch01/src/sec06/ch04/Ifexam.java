package sec06.ch04;

public class Ifexam {

	public static void main(String[] args) {
		int score=93;
		if(score>=90) {
			System.out.println("score가 90이상입니다");
			System.out.println("등급A");
		}
		if(score<90) 
		{	System.out.println("score가 90미만입니다");
			System.out.println("등급B");
		}
		System.out.println("끝");
		
		
		if(score>=90) {
			System.out.println("score가 90이상입니다");
			System.out.println("등급A");
		}else 
		{	System.out.println("score가 90미만입니다");
			System.out.println("등급B");
		}
		System.out.println("끝2");
	}

}
