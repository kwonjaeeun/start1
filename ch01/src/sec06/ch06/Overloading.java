package sec06.ch06;

public class Overloading {

	public static void main(String[] args) {
		Calc c= new Calc();
		c.sum(5, 10);
		c.sum(5, 10, 15);
		c.sum(5, 10, "15");
	}

}
class Calc {
	void sum(int n1,int n2){
		System.out.println(n1+n2);
	}
	void sum(int n1,int n2,int n3){
		System.out.println(n1+n2+n3);
	}
	void sum(int n1,int n2,String n3){
		System.out.println(n1+n2+n3);
	}
}