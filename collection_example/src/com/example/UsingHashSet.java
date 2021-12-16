package com.example;

import java.util.Collection;
import java.util.HashSet;

import com.example.model.Student;

public class UsingHashSet {
	public static void print(Collection<Student> objects) {
		for(Student eachStudent:objects) {
			System.out.println(eachStudent);
		}
	}

	public static void main(String[] args) {

		Student anand=new Student(101,"Anand",78);
		Student dravid=new Student(102,"Dravid",95);
		Student zahir=new Student(105,"Zahir",75);
		Student zahirSenior=new Student(105,"Zahir",75);

		HashSet<Student> hashSet=new HashSet<Student>();
		hashSet.add(anand);
		hashSet.add(dravid);
		hashSet.add(zahir);
		boolean isAdded=hashSet.add(zahirSenior);
		System.out.println("isAdded is "+isAdded);
		print(hashSet);
	}

}
