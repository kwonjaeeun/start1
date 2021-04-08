package sec06.ch06;

public class InheriExam {

	public static void main(String[] args) {
	Cat a=new Cat("나비",10);
	a.howling();
	a.lick();
	}

}
class Animal{
	String name;
	int age;
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	void howling() {
		System.out.println("운다");
	}
}
class Cat extends Animal{
	Cat(String name,int age){
		super(name,age);
	}
	@Override
	void howling() {
		System.out.println("야옹야옹");
	}
	void lick() {
		System.out.printf("%s 가 핥다\n",name);
	}
}

