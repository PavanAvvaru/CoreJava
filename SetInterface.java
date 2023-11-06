package com.bitlabs.collections_programs;

import java.util.HashSet;
import java.util.Set;
public class SetInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s1=new HashSet<Integer>();
		s1.add(10);
		s1.add(20);
		s1.add(30);
		Set<Integer> s2=new HashSet<Integer>();
		s2.add(10);
		s2.add(20);
		s2.add(30);
		System.out.println(s2.containsAll(s1));
		System.out.println(s1 +"\n"+s2);

	}

}
