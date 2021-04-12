package sec06.ch06;

public class PolymorMission {

	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal pig = new Pig();
		Animal hamster=new Hamster();
		Hamster a= (Hamster)hamster;
		a.runRail();

		cry(cat);
		cry(pig);
		cry(hamster);
		
	}
 public static void cry(Animal a) {
	 if(a instanceof Hamster) {
		 ((Hamster) a).runRail();
		 return;
	 }
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
	public void runRail() {
		System.out.println("쳇바퀴를 굴린다");
	}
}
class Cat extends Animal{
	@Override
	void howling() {
		System.out.println("냥~냥~");
	}
}