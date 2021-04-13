package sec06.ch07.starcraft;

public class StarcraftMain {
	public static void main(String[] args) {
		Medic medic = new Medic();
		Medic medic2 = new Medic();
		Marine marine= new Marine();
		Tank tank = new Tank();
		medic.heal(medic);
		medic.heal(medic2);
		medic.heal(marine);
		medic.heal(tank);
		System.out.println(medic2.getCurrerntHp());
		System.out.println(marine.getCurrerntHp());

	}

}
