package com.example;
import java.util.*;
import com.example.model.*;
public class UsingLinkedList {

	public static void main(String[] args) {

		Student anand=new Student(101,"Anand",78);
		Student dravid=new Student(102,"Dravid",95);
		Student zahir=new Student(105,"Zahir",75);

		LinkedList<Student> studList=new LinkedList<Student>();
		studList.add(anand);
		studList.add(dravid);
		studList.add(zahir);
//		Iterator< Student> itr  = studList.iterator();
		// SINCE STUDlIST IS LINKED LIST WE CAN ITERATE ON BOTH DIRECTION *** use previous instead of next
		ListIterator<Student> itr  = studList.listIterator();
		System.out.println("Forward Iteration");
		while(itr.hasNext()) {
			System.out.println(itr.next().getStudentName());
		}
		System.out.println("Backward Iteration");
		while(itr.hasPrevious()) {
			System.out.println(itr.previous().getStudentName());
		}
	}

}
