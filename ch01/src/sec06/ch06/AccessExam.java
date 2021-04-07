package sec06.ch06;

public class AccessExam {

	public static void main(String[] args) {
		Access acc= new Access();
		acc.printNum(); 
	}

}

class Access{
	private int num;
	
	void printNum(){System.out.println(num);}
}
