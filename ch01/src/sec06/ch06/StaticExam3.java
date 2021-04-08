package sec06.ch06;

public class StaticExam3 {

	public static void main(String[] args) {
		CalsInstance ci= new CalsInstance();
		int result=ci.sum(10, 20);
		System.out.println("result:"+result);
		int result2=CalsStatic.sum(20, 30);
		System.out.println("result:"+result2);
	}

}
class CalsStatic{
	static int sum(int num1,int num2) {
		return num1+num2;
	}
}
class CalsInstance{
	int sum(int n1,int n2) {
		return n1+n2;
	}
}