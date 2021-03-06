package com.example;
import com.example.model.*;
import java.util.*;

public class Application {

	public static void main(String[] args) {
		ArrayList<Student>  studList=new ArrayList<Student>();
		
		Student anand=new Student(101,"Anand",78);
		Student dravid=new Student(102,"Dravid",95);
		Student chandru=new Student(103,"Chandru",86);
		Student ramesh=new Student(104,"Ramesh",79);
		Student zahir=new Student(105,"Zahir",75);
//		can't add other than student object to the studList since it is a typesafe collection...collection of only student
		
//		String rakesh=new String("Rakesh"); 
//		studList.add(rakesh);
		
		studList.add(anand);//0
		studList.add(dravid);//1
		studList.add(chandru);//2
		studList.add(ramesh);//3
		studList.add(zahir);//4
//		System.out.println(studList.get(1));
		
		for (Student eachStudent:studList) {
			System.out.println(eachStudent);
		}
//		Down casting the object to student 
//		toArray() method return type is object but we require a Student[] array.so we rae doing down casting
//		Student[] list=(Student[]) studList.toArray();
//		System.out.println(list);
		
		
//		Student[] studentList= {
//				new Student(102,"Dharshini",95),
//				new Student(103,"Charu",86)
//		};
//		List<Student> listFromArray=Arrays.asList(studentList);
//		System.out.println(listFromArray);
		
		Object[] list=studList.toArray();
		for(Object obj:list) {
			Student stud=(Student)obj;
			System.out.println(stud.getStudentName());
		}
		
	}

}
