package com.example.ifaces;

import java.util.*;

import com.example.model.Doctor;

public interface CrudRepository <T>{

	public boolean add(T object);
	public Set<Doctor> findAll();
	public boolean remove(T object);
	public T update(T object, String revisedValue);
//	Doctor update(Doctor object, String revisedValue);

}
