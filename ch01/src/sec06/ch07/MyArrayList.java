package sec06.ch07;

public class MyArrayList implements MyList {
	int[] a=new int[0];
	@Override
	public void add(int aaa) {
		int[] b= new int[a.length+1];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		b[a.length]=aaa;
		a=b;
		}
	
	@Override
	public int size() {
		return a.length;
	}
	@Override
	public int get(int aaa) {
		return a[aaa];
	}

}
