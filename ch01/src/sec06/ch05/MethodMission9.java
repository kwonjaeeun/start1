package sec06.ch05;

public class MethodMission9 {

	public static void main(String[] args) {
		int[] arr= {4,8,10,11,45,66};
		String result = toSring(arr);
		System.out.println(result);
		result=tostring2(arr);
		System.out.println(result);
	}

	public static String tostring2(int[] arr) {
		String result="";
		result+="[";
		for(int i=0;i<arr.length;i++) {
			result+=arr[i];
			if(i!=arr.length-1) {
				result+=",";
			}
		}
		result+="]";
		return result;
	}

	public static String toSring(int[] arr) {
		String result="";
		for(int i=0;i<arr.length;i++) {
			if(i==0) {
				result+="[";
			}
			result+=arr[i];
			if(i==arr.length-1) {
				result+="]";
			}else {
				result+=",";
			}
		}
		return result;
	}
	
	
	
}
