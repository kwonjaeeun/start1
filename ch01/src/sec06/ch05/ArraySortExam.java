package sec06.ch05;

import java.util.Arrays;

public class ArraySortExam {

	public static void main(String[] args) {
		int[] arr= {8,7,3,1,6};
		for(int i=0;i<arr.length;i++) {
			for(int z=i+1;z<arr.length;z++) {
				if(arr[i]>arr[z]) {
					int tmp=arr[i];
					arr[i]=arr[z];
					arr[z]=tmp;
					
				}
				System.out.println(Arrays.toString(arr));
			}
		}
		System.out.println(Arrays.toString(arr));

		System.out.println("-------------------------------------");
		
		int[] arr2= {8,7,3,1,6};
		for(int i=0;i<arr2.length;i++) {
			int index=0;
			for(int z=index+1;z<arr2.length;z++) {
				if(arr2[index]>arr2[z]) {
					int tmp=arr2[index];
					arr2[index]=arr2[z];
					arr2[z]=tmp;
					index++;	
				}
				System.out.println(Arrays.toString(arr2));
			}
		}
		System.out.println(Arrays.toString(arr2));
	}

}
