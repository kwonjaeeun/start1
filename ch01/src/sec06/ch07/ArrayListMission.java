package sec06.ch07;

import java.util.List;

import sec06.ch06.blackjack.Card;

import java.util.ArrayList;


public class ArrayListMission {
	public static void main(String[] args) {
		MyList list = new MyArrayList();
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(50);
		list.add(2,30);
		
		int delval=list.remove(1);
		System.out.println(delval);
		for(int i=0;i<list.size();i++) {
			System.out.printf("%d: %d\n",i,list.get(i));
		}
		int val= list.remove();
		System.out.println(val);
		val= list.remove();
		System.out.println(val);
		val= list.remove();
		System.out.println(val);
		val= list.remove();
		System.out.println(val);
		val= list.remove();
		System.out.println(val);
		val= list.remove();
		System.out.println(val);
		val= list.remove();
		System.out.println(val);
		val= list.remove();
		
	}

}
