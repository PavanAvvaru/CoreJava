package com.bitlabs.collections_programs;
import java.lang.*;
import java.util.*;
class employe implements Comparable<employe>
{
	int id;
	String name;
	int salary;
	public employe(int id,String name,int salary) 
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public String toString()
	{
		return " id :"+id+" name : "+name+" salary : "+salary+" /- rs";
	}
	
	public int compareTo(employe o) {
		return this.id-o.id;

	}
}
public class compareMethods {

	public static void main(String[] args) 
	{
		employe e1=new employe(1,"nani",15500);
		employe e2=new employe(2,"pavan",25000);
		employe e3=new employe(3,"nani",95500);
		employe e4=new employe(4,"pavan",35000);
		Queue<employe> a=new PriorityQueue<employe>();
		a.add(e1);
		a.add(e2);
		a.add(e3);
		a.add(e4);
		for (employe employe : a) {
			System.out.println(employe);
		}
	}

}
