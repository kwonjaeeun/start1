package sec06.ch08;

public class ExceptiojnExam2 {

	public static void main(String[] args) {
		
			Calc2 c= new Calc2();
			int x = 0;
			try {
				x = c.div(10, 2);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(x);
		
	}

}
class Calc2{
	int div(int n1, int n2) throws Exception {
			System.out.println("1");
			return n1/n2; 

	}
}