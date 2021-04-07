package sec06.ch06;

import java.awt.Checkbox;

public class InstanceExam6 {

	public static void main(String[] args) {
		Tv tv= new Tv();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		tv.displayVolume();
		tv.brand="Samsung";
		tv.inch=100;
		tv.maxChannel=100;
		tv.maxVolume=100;
		tv.displayState();
		Tv tv2 =new Tv("Lg",120,300,200);
		tv2.displayVolume();
		tv2.displayState();
	}
	
}

class Tv{
	String brand;
	int inch;
	int maxChannel;
	int maxVolume;
	int currentChannel;
	int currentVolume;

	Tv(){
		
	}
	Tv(String brand, int inch, int maxChannel, int  maxVolume) {
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