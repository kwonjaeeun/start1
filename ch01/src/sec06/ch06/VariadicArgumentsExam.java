package sec06.ch06;

public class VariadicArgumentsExam {

	public static void main(String[] args) {
		Calc2 cal= new Calc2();
		cal.sum(10,20);
		cal.sum(10,20,30);
		cal.sum(10,20,30,40);
		cal.sum(10,20,30,40,40,40,40,40,40,40);
	}

}
class Calc2{
	int sum(int...vals) {//변수가 가변한경우**********
		int sum=0;
		for(int i=0;i<vals.length;i++)
			sum+=vals[i];
		System.out.println("sum: "+sum);
		return 0 ;
		
	}
}