package ch01;

public class Examples {

	public static void main(String[] args) {
		System.out.println("하하");
		System.out.println("호호");
		System.out.println();
		System.out.print("하하");
		System.out.print("허허");
		System.out.print("호호");
		int a = 14;
		char type = 'O';
		float weight = 50.4f;
		String name = "장보고";
		System.out.println("제이름은 홍길동이며 나이는 14살이고 혈액형은 O형이고 몸무게는 50.4입니다");
		System.out.println("제이름은" + name + "이며 나이는 " + a + "살이고 혈액형은 " + type + "형이고 몸무게는 " + weight + "입니다");
		System.out.printf("제이름은 %s이며 나이는 %d살이고 혈액형은 %c형이고 몸무게는 %.2f입니다",name,a,type,weight);
		//패키지 네이밍규칙= 대문자x
		//.두개이상
	}

}
