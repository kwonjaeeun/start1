package sec06.ch06;

public class StaticExam5 {

	public static void main(String[] args) {
		StaticExam5 s=new StaticExam5();
		s.n1=10;
		s.n2=20;
		System.out.println("결과:"+s.sum());
		System.out.println(args[0]);
	}
	int n1;
	int n2;
	public int sum() {
		return n1+n2;
	}

}

