package sec06.ch07.starcraft;

public class Marine implements Bionic {
	private int currerntHp=10;
	public final int MaxHp=20;
	
	public int getCurrerntHp() {
		return currerntHp;
	}
	public void setCurrerntHp(int currerntHp) {
		this.currerntHp = currerntHp;
	}
	
}
