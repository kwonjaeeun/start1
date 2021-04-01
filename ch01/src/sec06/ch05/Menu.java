package sec06.ch05;

public class Menu {
	String name[];
	int price[];
	int count[];
	int result;
	
	public Menu(String[] name,int[] price,int[] count) {
		this.name= name;
		this.price=price;
		this.count=count;
	}
	public int Result(){
		for(int i=0; i<this.name.length;i++) {
			this.result+=this.price[i]*this.count[i];
		}
		return this.result;
	}
	
}
