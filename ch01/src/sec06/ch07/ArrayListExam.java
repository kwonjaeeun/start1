package sec06.ch07;

import java.util.List;

import sec06.ch06.blackjack.Card;

import java.util.ArrayList;


public class ArrayListExam {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(10);
		list.add(10.2);
		list.add("ddd");
		list.add(new Card("",""));
		
		int val2=(int)list.get(0);
		
		
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		
		
		
	}

}
