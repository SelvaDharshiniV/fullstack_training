package com.example.ifaces;
import java.util.List;
import com.example.model.*;
public interface CrudRepository<T> {
	public boolean add(T object);
	public List<T> findAll();
	public T update(T object, double revisedValue);
	public boolean remove(T object);

}
