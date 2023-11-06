package com.bitlabs.collections_programs;

import java.util.*;
import java.util.Queue;

class Studnt
{
	String name;
	double marks;
	public Studnt(String name,double marks) 
	{
		// TODO Auto-generated constructor stub
		this.name=name;
		this.marks=marks;
	}
	@Override
	public String toString() 
	{
		return name+" has scored "+marks+" marks";
	}
}
public class FormatDisplayCollection {
	public static void main(String[] args) {
		//TreeSet<Studnt> qs=new TreeSet<Studnt>();
		Studnt s1=new Studnt("nani",95);
		Studnt s2=new Studnt("pavan",85);
		Studnt s3=new Studnt("manju",90);
		List<Studnt> qs=new ArrayList<>();
		qs.add(s1);
		qs.add(s2);
		qs.add(s3);
		for (Studnt studnt : qs) {
			System.out.println(studnt);
		}
		
	}

}
