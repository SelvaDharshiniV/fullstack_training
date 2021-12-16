package com.example.services;

import java.util.*;

import com.example.ifaces.CrudRepository;
import com.example.model.Doctor;

public class DoctorService implements CrudRepository<Doctor> {

	private HashSet<Doctor> docList;
	
	public DoctorService() {
		super();
		docList=new HashSet<Doctor>();	}
	@Override
	public boolean add(Doctor object) {
		return docList.add(object);
	}

	@Override
	public Set<Doctor> findAll() {
		return this.docList;
	}

	@Override
	public boolean remove(Doctor object) {
		return docList.remove(object);
	}
	@Override
	public Doctor update(Doctor object, String revisedValue) {
		boolean result=docList.remove(object);
		object.setLocation(revisedValue);
		docList.add(object);
		return object;

//		int idxPosition =docList.indexOf(object);
//		Doctor foundDoctor = docList.get(idxPosition);
//		foundDoctor.setLocation(revisedValue);
//		return docList.set(idxPosition,foundDoctor);
	}


}
