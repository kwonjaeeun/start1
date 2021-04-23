package sec06.ch08;

public class ExceptiojnExam {

	public static void main(String[] args) {
		
			Calc c= new Calc();
			int x=c.div(10, 2);
			System.out.println(x);
		
	}

}
class Calc{
	int div(int n1, int n2) {
		try {
			System.out.println("1");
			return n1/n2; 
		}catch (Exception e) {
			System.out.println("예외발생");
		}finally {
			System.out.println("무조건발생");//return해도 실행
		}
		return 0;
	}
}