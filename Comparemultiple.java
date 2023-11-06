package com.bitlabs.collections_programs;

import java.util.Comparator;
import java.util.TreeSet;

class student
{
	int id;
	int age;
	public student(int id,int age) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.age=age;
	}
	@Override
	public String toString() {
		return "student id : "+id+" age : "+age;
	}
}
class sortbyid implements Comparator<student>
{
	@Override
	public int compare(student o1,student o2)
	{
		return o1.id-o2.id;
	}
}
public class Comparemultiple {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s=new student(10, 22);
		student s1=new student(5, 21);
		student s2=new student(8, 20);
		TreeSet<student> t=new TreeSet<student>(new sortbyid());
		t.add(s1);
		t.add(s);
		t.add(s2);
		for (student student : t) {
			System.out.println(student);
		}
	}
}
