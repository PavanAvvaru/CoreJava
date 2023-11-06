package com.bitlabs.collections_programs;
import java.util.*;
class movie
{
	int yearofrelease;
	String name;
    public movie(int yearofrelease,String name) 
    {
        this.yearofrelease=yearofrelease;
        this.name=name;
    }
    public String toString() {
		return "  movie : "+name+" year of release : "+yearofrelease;
	}
}
class sortbyyear implements Comparator<movie>
{
	@Override
	public int compare(movie o1, movie o2) {
		// TODO Auto-generated method stub
		return o2.yearofrelease-o1.yearofrelease;
	}
}
public class Answers4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		movie m1=new movie(2023,"baby");
		movie m2=new movie(2022,"king");
		movie m3=new movie(2019,"brusely");
		Queue<movie> t=new LinkedList<movie>();
		t.add(m1);
		t.add(m2);
		t.add(m3);
		for (movie movie : t) {
			System.out.println(movie);
		}
	}

}
