package com.example;

import java.util.*;
import java.util.logging.Logger;

import com.example.ifaces.StudentRepository;
import com.example.model.Student;
import com.example.services.StudentService;

public class CrudApplication {

	public static void main(String[] args) {

		Logger logger= Logger.getAnonymousLogger();
		Student anand=new Student(101,"Anand",78);
		Student dravid=new Student(102,"Dravid",95);
		Student chandru=new Student(103,"Chandru",86);
		Student ramesh=new Student(104,"Ramesh",79);
		Student zahir=new Student(105,"Zahir",75);
		
		StudentRepository<Student> repo=new StudentService(); 
		repo.add(anand);
		repo.add(dravid);
		repo.add(chandru);
		repo.add(ramesh);
		repo.add(zahir);
		boolean result=repo.remove(ramesh);


		List<Student> top3List = repo.getTopThreeByMark();
		logger.info("***top3***");
		for(Student eachStudent:top3List) {
			System.out.println(eachStudent);
		}
		
		
		Student update= repo.update(anand, 80);
		logger.info("***Anand mark is updated***");
		System.out.println(update);
		
		
//		List<Student> list=repo.findAll();
//		Collections.sort(list);
//		Collections.sort(list,new StudentNameComparator());
//		Collections.sort(list,new MarksComparator());
		
		Iterator<Student> itr = repo.findAll().iterator();
		while(itr.hasNext())
		{
			logger.info(itr.next().toString());	
		}
		
		
		if(result) {
			logger.info("Ramesh is deleted");
		}else {
			throw new RuntimeException("student dosent exist");
		}
	}

}
