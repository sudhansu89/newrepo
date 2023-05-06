package com.nt.collection;

import java.util.HashSet;

public class Traverse_HasSet {

	public static void main(String[] args) {
		HashSet<String>hs=new HashSet();
		hs.add("apau");
		hs.add("sipiu");
		hs.add("raja");
		hs.add("apuja");
		hs.add("uyfy");
		hs.add("");
		hs.add(null);
		hs.add("apau");
		for(String s1:hs) {
			System.out.println(s1);
		}
		System.out.println(hs);
	}

}
