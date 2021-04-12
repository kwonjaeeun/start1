package sec06.ch07;

public class PolyMission {

	public static void main(String[] args) {
		Car car1= new Car();
		Car car2=new Bus();
		Car car3=new Truck();
		Car car4=new LocalBus();
		
		blowKlaxon(car1);
		blowKlaxon(car2);
		blowKlaxon(car3);
		blowKlaxon(car4);
		
	}

	public static void blowKlaxon(Car car) {
		if(car instanceof Bus) {
			((Bus) car).openDoor();
			return;
		}
		car.hoot();
	}

}
