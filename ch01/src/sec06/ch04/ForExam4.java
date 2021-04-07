package sec06.ch04;

public class ForExam4 {

	public static void main(String[] args) {
		String[] strArr= {"A","B","C","D"};
		System.out.println("------------------------------1역출력");
		for(int i=strArr.length-1;i>-1;i--) {
			System.out.println(strArr[i]);
		}
		System.out.println("------------------------------2재귀함수");
		read(strArr,0);
		System.out.println("------------------------------3foreach");
		for(String val:strArr) {
			System.out.println(val);
		}
		System.out.println("------------------------------4순서바꿔버려서 foreach");
		String[] str2= new String[strArr.length];
		for(int i=strArr.length-1;i>-1;i--) {
			str2[strArr.length-1-i]=strArr[i];
		}
		strArr=str2;
		for(String val:strArr) {
			System.out.println(val);
		}
	}
	public static void read(String[] a,int i) {
		if(i>=a.length)
		{	return;
		}else {
			read(a,i+1);
			System.out.println(a[i]);
			return;
		}
	}
}
