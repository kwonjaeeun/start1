package sec06.ch06;

public class StaticExam4 {

	public static void main(String[] args) {
		CalsInstance2 ci= new CalsInstance2();
		ci.num1=10;ci.num2=20;
		System.out.println("result:"+ci.sum());
		
	}

}
class CalsStatic2{
	static int sum(int num1,int num2) {
		return num1+num2;
	}
}
class CalsInstance2{
	static int num1;
	static int num2;
	int sum() {
		return num1+num2;
	}
}