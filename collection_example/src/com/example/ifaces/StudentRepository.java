package com.example.ifaces;
import java.util.*;
public interface StudentRepository<T> extends CrudRepository <T>{
	List<T> getTopThreeByMark();
}
