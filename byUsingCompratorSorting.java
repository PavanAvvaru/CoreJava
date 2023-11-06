package com.bitlabs.collections_programs;
import java.util.Comparator;
import java.util.TreeSet;

class emp
{
	int id;
	String name;
	public emp(int id,String name) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "employeee id : "+id+"  name : "+name;
	}
}
class sortbyname implements Comparator<emp>
{

	@Override
	public int compare(emp o1, emp o2) {
		// TODO Auto-generated method stub
		return o2.name.compareTo(o1.name);
	}
}
public class byUsingCompratorSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emp e=new emp(1,"nani");
		emp e1=new emp(2,"pavan");
		emp e2=new emp(3,"manju");
		TreeSet<emp> t=new TreeSet<emp>(new sortbyname());
		t.add(e);
		t.add(e1);
		t.add(e2);
		for(emp emp:t) {
		System.out.println(emp);
		}
	}
}
