package sec06.ch06;

public class InstanceExam {

	public static void main(String[] args) {
		Dog d1=new Dog();
		Dog d2=new Dog();
		d1.name="뽀삐";
		d2.name="돌쇠";
		d1.bark();
		d2.bark();
	}

}
class Dog {
	String name;
	String jong;
	int age;
	void bark() {
		System.out.printf("%s가 멍멍\n",name);
	}
}