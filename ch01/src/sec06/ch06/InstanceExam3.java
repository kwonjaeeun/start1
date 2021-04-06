package sec06.ch06;

import java.awt.Checkbox;

public class InstanceExam3 {

	public static void main(String[] args) {
		int M_num=10;
		Box box = new Box();
		box.num=10;
		
		changeNum(M_num);
		changeBoxNum(box);
		System.out.println(M_num);
		System.out.println(box.num);
	}
	public static void changeNum(int num){
		num=20;
	}
public static void changeBoxNum(Box box){
		box.num=20;
	}
	
	
	
	

}

class Box{
	int num;
}
