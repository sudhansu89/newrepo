package com.nt.collection;

import java.util.ArrayList;

public class TraverseArrayList {

	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		System.out.println("TraverseArrayList usesing for each loop");
		for(Integer traverseEleent:al) {
		System.out.println("TraverseArrayList Element are::"+traverseEleent);	
		}
	}

}
