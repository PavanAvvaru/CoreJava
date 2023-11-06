package com.bitlabs.collections_programs;
import java.util.*;
import java.lang.*;
class stude
{
	String name;
	double marks;
	public stude(String name,double marks) 
	{
		// TODO Auto-generated constructor stub
		this.name=name;
		this.marks=marks;
	}
	@Override
	public String toString() 
	{
		return name+"  "+name+" has scored "+marks+" marks";
	}
}
public class FormatSceanrio {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stude e=new stude("nani",98);
		stude e1=new stude("pavan",85);
		stude e2=new stude("manju",95);
		LinkedList<stude> s=new LinkedList<stude>();
		s.add(e);
		s.add(e1);
		s.add(e2);
		
		for(stude s1:s) 
		{
		System.out.println(s1);
		}
	}
}
