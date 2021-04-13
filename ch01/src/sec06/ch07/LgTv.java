package sec06.ch07;

public class LgTv implements RemoteControl {
	private int volume;
	@Override
	public void volumeUp() {
	volume++;
	}

	@Override
	public void volumeDown() {
		volume--;	
	}

	@Override
	public void chkVolume() {
		System.out.println("volume: " + volume);
	}


}
