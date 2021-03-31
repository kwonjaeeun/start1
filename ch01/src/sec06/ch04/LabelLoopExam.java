package sec06.ch04;

public class LabelLoopExam {

	public static void main(String[] args) {
		iii:
		for(int i=0;i<5;i++) {
			jjj:
			for(int j=0;j<5;j++) {
				System.out.println(i +" "+j);
				if(j==3)
					continue iii;
			}
		}
		zzz:
		for(int z=0;z<5;z++) {
			System.out.println(z);
		}	
	}

}
