package sec06.ch06;

public class InheriExam {

	public static void main(String[] args) {
		Cat a = new Cat();
		a.howling();
		
	}

}

class Animal {
	String name;
	int age;

	/*
	 * public Animal(String name, int age) { super(); this.name = name; this.age =
	 * age; System.out.println("Animal생성자"); }
	 */
	void howling() {
		System.out.println("운다");
	}
}
/*
 * class Cat extends Animal{ int cnt;
 * 
 * 
 * Cat(){ super("",1); System.out.println("Cat생성자"); }
 * 
 * @Override void howling() { System.out.println("야옹야옹(ว˙∇˙)ง\n" + ""); } void
 * lick() { System.out.printf("%s 가 핥다\n",name); } } class Koshort extends Cat{
 * 
 * 
 * Koshort(String name, int age) { super(); System.out.println("koshort생성자"); }
 * 
 * 
 * }
 */