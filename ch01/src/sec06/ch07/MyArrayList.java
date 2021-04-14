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
	@Override
	public int remove() {
		if(a.length<=0) {
			System.out.println("뺄 값이 없습니다!!!0을 반환합니다");
			return 0;
		}
		int result= a[a.length-1];
		int[] temp=new int[a.length-1];
		for(int i=0;i<a.length-1;i++) {
			temp[i]=a[i];
		}
		a=temp;
		return result;
	}

	@Override
	public void add(int i, int j) {
		int[] temp=new int[a.length+1];
		int index=0;
		for(int z= 0; z<a.length+1;z++) {
			if(z==i) {
			temp[z]=j;
			continue;
			}
			temp[z]=a[index++];
		}
		a=temp;
	}

	@Override
	public int remove(int i) {
		if(a.length<=0) {
			System.out.println("뺄 값이 없습니다!!!0을 반환합니다");
			return 0;
		}
		int result= a[i];
		int[] temp=new int[a.length-1];
		int index=0;
		for(int z=0;z<temp.length;z++) {
			if(z==i) {
				temp[z]=a[++index];
			}
			temp[z]=a[index++];
		}
		a=temp;
		return result;
	}

}
