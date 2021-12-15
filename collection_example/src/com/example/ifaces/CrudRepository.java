package com.example.ifaces;
import java.util.List;
import com.example.model.*;
public interface CrudRepository<T> {
	public boolean add(T object);
	public List<T> findAll();
	public Student updateMark(T object, double rtevisedMark);
	public boolean remove(T object);

}
