package com.example.services;

import java.util.*;

import com.example.ifaces.StudentRepository;
import com.example.model.Student;
import com.example.utils.MarksComparator;

//public class StudentService implements CrudRepository {
	public class StudentService implements StudentRepository<Student> {

	private ArrayList<Student> studList;
	
	public StudentService() {
		super();
		studList=new ArrayList<Student>();
	}

	@Override
	public boolean add(Student object) {
		
		return studList.add(object);
	}

	@Override
	public List<Student> findAll() {
		
		return this.studList;
	}

	@Override
	public Student update(Student object, double revisedValue) {
		int indPosition=studList.indexOf(object); // 1
		Student foundStudent=studList.get(indPosition);// given values [rollNumber=101, studentName=Anand, markScored=78.0]
		foundStudent.setMarkScored(revisedValue);// setting new values 80
//		return foundStudent;
		return studList.set(indPosition, foundStudent );
	}

	@Override
	public boolean remove(Student object) {
		return studList.remove(object);
	}

	@Override
	public List<Student> getTopThreeByMark() 
	{
		ArrayList<Student> top3=new ArrayList<Student>();
		Collections.sort(this.studList,new MarksComparator());

		for(int i=0;i<=2;i++) {
//		for(int i=3;i>=1;i--) { //for reverse order
			top3.add(studList.get(i));
		}
		return top3;
	}

}
