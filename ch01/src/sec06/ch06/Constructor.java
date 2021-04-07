package sec06.ch06;

public class Constructor {
	private static void main(String[] args) {
		Tv2 tv= new Tv2();
		
	}
}
class Tv2{
	String brand;
	int inch;
	int maxChannel;
	int maxVolume;
	int currentChannel;
	int currentVolume;

	Tv2(){
		this("일렉트로", 100,100, 100);
		/*
		 * brand="일렉트로"; inch=100; maxChannel=100; maxVolume=100;
		 */
	}
	Tv2(String brand, int inch, int maxChannel, int  maxVolume) {
		this.brand=brand;
		this.inch=inch;
		this.maxChannel=maxChannel;
		this.maxVolume= maxVolume;
	}
	public void volumeUp() {
		this.currentVolume++;
	}
	public void displayVolume() {
		System.out.println(currentVolume);
	}
	public void displayState() {
		System.out.printf("%s %sinch %sChannel %sVolume\n",brand,inch,maxChannel,maxVolume);
		
	}
	
	
}