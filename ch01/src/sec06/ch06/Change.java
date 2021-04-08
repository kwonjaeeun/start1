package sec06.ch06;

import java.util.Scanner;

public class Change {
	public static void main(String[] args) {
		String[] a= new String[33];
		init(a);
		shuffle(a);
		print(a);
	}
public static void init(String[] a) {
	String[] s= {"권재은","김동훈","신홍준","옥찬호","우정민","이주찬","이준형","최재송","강성헌","김동영","김상혁",
			"김성욱","김윤기","김지민","김지영","김진철","김태경","박민지","박은영","박지영","박지은","안원영",
			"오재문","유병욱","이경욱","이지수","임지영","장현진","정수영","조현민","조희주","하승우","홍준호"};
	for(int i=0;i<a.length;i++) {
		a[i]=s[i];
	}
	
}
public static void shuffle(String[] a) {
	for(int i=0;i<a.length;i++) {
		int c=(int)(Math.random()*a.length);
		String temp=a[i];
		a[i]=a[c];
		a[c]=temp;
	}
}
public static void print(String[] a) {
	Scanner scan=new Scanner(System.in);
	for(int i= 0;i<a.length;i++) {
		System.out.printf("%2d.%s",(i+1),a[i]);
		String s=scan.nextLine();
		if(s=="") {
			continue;
		}
	}System.out.println("--끝--");
}

}
