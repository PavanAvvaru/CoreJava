package com.bitlabs.collections_programs;

import java.util.HashSet;

public class hashSetInterface {

	public static void main(String[] args) {
		HashSet<Integer> h=new HashSet<Integer>();
		h.add(10);
		h.add(20);
		h.add(20);
		h.add(40);
		System.out.println(h);

	}

}
