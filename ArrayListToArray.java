package com.Array;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		List<Student> list = new ArrayList<Student>();
		
		Student s = new Student();
		
		s.setName("venu");
		
		Student s1=new Student();
		
		s1.setName("sateesh");
		
		s1.setRollnum(143);
		
		s.setRollnum(123);
		
		list.add(s);
		
		list.add(s1);
		
		
		
		for(int i=0;i<list.size();i++) {
			
			System.out.println(list.get(i));
		}
		
		Student[] studentarr = new Student[list.size()];
		
		studentarr  =	list.toArray(studentarr);
	
	for(int i=0;i<studentarr.length;i++) {
		Student t1=studentarr[i];
		System.out.println(t1.getRollnum());
		System.out.println(t1.getName());
	}

	}

}
