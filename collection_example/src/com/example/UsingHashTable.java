package com.example;
import java.util.*;
import com.example.model.Student;

public class UsingHashTable {

	public static void main(String[] args) {

		Student anand=new Student(101,"Anand",78);
		Student dravid=new Student(102,"Dravid",95);
		Student zahir=new Student(105,"Zahir",75);

		Hashtable<Integer,Student> map=new Hashtable<Integer,Student>();
		map.put(1, null);
		if(map.get(1)==null) {
			map.put(1, anand);
		}
	}
}
//  
