package sec06.ch06;

public class PolymorMission {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Pig pig = new Pig();
		Hamster hamster=new Hamster();
		Animal a=new Cat();
		cry(cat);
		cry(pig);
		cry(hamster);
		
	}
 public static void cry(Animal a) {
	 a.howling();
 }

}
class Pig extends Animal{
	@Override
	void howling() {
		System.out.println("꿀~꿀~");
	}
}

class Hamster extends Animal{
	@Override
	void howling() {
		System.out.println("찍~찍~");
	}
}
class Cat extends Animal{
	@Override
	void howling() {
		System.out.println("냥~냥~");
	}
}