package com.nt.collection;

import java.util.ArrayList;
import java.util.List;

public class Conversion_List_To_Array {

	public static void main(String[] args) {
		List<Object>l1=new ArrayList<Object>();
		l1.add("papu");
		l1.add("sipu");
		l1.add("raaja");
		l1.add(1);
		l1.add(9777);
		System.out.println("the array list are::"+l1);
		Object [] s1 = new Object[l1.size()];
		l1.toArray(s1);
		System.out.println("After convertion::");
		for(Object obj:s1) {
			
			System.out.println(obj);
		}
	}

}
