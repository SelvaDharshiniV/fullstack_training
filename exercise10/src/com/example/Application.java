package com.example;
import java.util.*;
import com.example.model.*;
import com.example.services.DoctorService;

public class Application {
	public static void main(String[] args) {

		Patient ram=new Patient(01, "ram", "chennai", "ram@gmail.com");
		Patient shyam=new Patient(02,"shyam","chennai","shyam@gmail.com");
		
		HashSet<Patient> patientSet=new HashSet<Patient>();
		
		patientSet.add(ram);
		patientSet.add(shyam);

		Staff sumathi=new Staff(101, "sumathi", "nurse1", "phone");
		Staff kani=new Staff(102, "sumathi", "nurse2", "phone");
		Staff rani=new Staff(103, "sumathi", "nurse3", "phone");
		
		HashMap<String, Staff> map=new HashMap<String,Staff>();
		
		map.put("nurse1",sumathi);
		map.put("nurse2",kani);
		map.put("nurse3",rani);
		
		Doctor priya=new Doctor(1,"priya","MBBS","Anakaputhur",patientSet,map);
		Doctor manoj=new Doctor(2,"manoj","BBS","Pallavram",patientSet,map);
		Doctor praveen=new Doctor(3,"praveen","BDS","Chrompet",patientSet,map);
		DoctorService service=new DoctorService();
		service.add(priya);
		service.add(manoj);
		service.add(praveen);
		
		boolean result=service.remove(praveen);
		if(result) {
			System.out.println("Praveen is deleted");
		}else {
			throw new RuntimeException("Doctor dosent exist");
		}
		
		Set<Doctor> doctorList = service.findAll();
		for(Doctor eachDoctor:doctorList) {
			System.out.println(eachDoctor);
			for(Patient eachPatient:eachDoctor.getPatientList()) {
				System.out.println(eachPatient.getPatientName());
			}
		}
		System.out.println(priya.getStaffDetails().get("nurse1"));
		
//		Set<Map.Entry<Integer, Student>> studSet=map.entrySet();
//		for (Map.Entry<Integer, Student> eachStud:studSet) {
//			System.out.println("key:"+eachStud.getKey());
//			System.out.println("value:"+eachStud.getValue());
//		}

		Doctor update= service.update(priya, "Pammal");
		System.out.println(update); 
		
	}

}
