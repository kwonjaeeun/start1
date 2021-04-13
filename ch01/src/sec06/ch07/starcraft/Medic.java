package sec06.ch07.starcraft;

public class Medic implements Bionic {
	private int currerntHp=3;
	public final int MaxHp=15;
	
	public int getCurrerntHp() {
		return currerntHp;
	}
	public void setCurrerntHp(int currerntHp) {
		this.currerntHp = currerntHp;
	}
	public void heal(Object unit) {
		if(!(unit instanceof Bionic)||unit==this) {
			System.out.println("치료불가");
			return;
		}
			
		if(unit instanceof Marine) {
			Marine m=(Marine)unit;
			int hp= m.getCurrerntHp();
			if(hp<m.MaxHp) {
				m.setCurrerntHp(++hp);
				return;
			}
			System.out.println("치료불가");
		}else if(unit instanceof Medic) {
			Medic m=(Medic)unit;
			int hp= m.getCurrerntHp();
			if(hp<m.MaxHp) {
				m.setCurrerntHp(++hp);
				return;
			}
			System.out.println("치료불가");
		}
		return;
	}

}
