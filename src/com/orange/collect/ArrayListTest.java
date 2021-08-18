package com.orange.collect;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("Korea");
		list.add("Japan");
		list.add("China");
		list.add(0, "American"); // 인덱스 0에다가 집어넣는다. 맨위로 올라감

		System.out.println("ArrayList size of " + list.size());
		System.out.println("index[1] value is " + list.get(1));
		System.out.println("===================================");

		for (int i = 0; i < list.size(); i++) {
			String temp = (String) list.get(i);
			System.out.println("ArrayList Value is [" + temp + "]");
		}
		System.out.println("===================================");
        list.remove(2);
       
        for(int i=0; i<list.size(); i++) {
        	String str = list.get(i);
        	System.out.println("ArrayList Value is [" + str + "]");
        }
        System.out.println("===================================");
		
		list.clear();
		System.out.println("02 ArrayList size of " + list.size());
	}
}
