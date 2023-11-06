package com.bitlabs.collections_programs;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

class Employee 
{
    String name;
    int salary;

    public Employee(String name,int salary) 
    {
        this.name=name;
        this.salary=salary;
    }
    public String toString() {
		return "employee name : "+name+"  salary : "+salary;
	}
    
}
class sortbysalary implements Comparator<Employee>
{
	@Override
	public int compare(Employee o1,Employee o2) 
	{
		// TODO Auto-generated method stub
		return o2.name.compareTo(o1.name);
	}
}
public class CompareSeniario01 
{
	public static void main(String[] args) 
	{
		    // TODO Auto-generated method stub
		    Employee e=new Employee("nani",25000);
		    Employee e1=new Employee("pavan",10000);
		    Employee e2=new Employee("nani",30000);
		    
		    TreeSet<Employee> t=new TreeSet<Employee>(new sortbysalary());
		    t.add(e);
		    t.add(e1);
		    t.add(e2);
		    int max=e.salary;
		    int min=e.salary;
		    for(Employee emp:t) 
	        {
		         if (emp.salary>max) 
		         {
			         max=emp.salary;	
			     }
	        }
		    for(Employee emp:t) 
	        {
		         if (emp.salary<min) 
		         {
			         min=emp.salary;	
			     }
	        }
		    for(Employee emp:t) 
	        {
	        	if(emp.salary==min) {
	        		System.out.println("manimunm salary employee details"+emp);
	        	}
	        	if(emp.salary==max) {
	        		System.out.println("maximun=m salary employee details"+emp);
	        		
	        	}
	        }
		    System.out.println("salary between 20000 to 30000");
	        for(Employee emp:t) 
	        {
	        	
	            if(emp.salary>=20000&&emp.salary<=30000) 
	            {
	                System.out.println(emp);
	            }
	        }
	  }
}
