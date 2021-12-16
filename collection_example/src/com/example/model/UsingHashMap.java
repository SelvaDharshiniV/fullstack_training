package com.example.model;

import java.util.*;

public class UsingHashMap {
		public static void main(String[] args) {

			Student anand=new Student(101,"Anand",78);
			Student dravid=new Student(102,"Dravid",95);
			Student zahir=new Student(105,"Zahir",75);
			Student zahirSenior=new Student(105,"ZahirSenior",75);

			HashMap<Integer,Student> map=new HashMap<Integer,Student>();
//			AutoBoxing feature of java allows
//			   primitive 989 to be converted to object Integer
			System.out.println(map.put(101,anand));
			System.out.println(map.put(102,dravid));
			System.out.println(map.put(103,zahir));
			System.out.println(map.put(103,zahirSenior));
//			it will return the new entry(zahirSenior) and not the old one
//			it replaces the old entry with new one
			System.out.println(map.get(103));
			
			//iteration using while
			Set<Map.Entry<Integer, Student>> setView=map.entrySet();
			Iterator<Map.Entry<Integer, Student>> itr  = setView.iterator();
			System.out.println("**iteration using while**");
			while(itr.hasNext()) {
				Map.Entry<Integer, Student> eachElement=itr.next();
				System.out.println("key:"+eachElement.getKey());
				System.out.println("value:"+eachElement.getValue());
//				System.out.println("key:"+itr.next().getKey());
//				System.out.println("value:"+itr.next().getValue());
			}
			// forEach
			System.out.println("**forEach**");
			Set<Map.Entry<Integer, Student>> studSet=map.entrySet();
			for (Map.Entry<Integer, Student> eachStud:studSet) {
				System.out.println("key:"+eachStud.getKey());
				System.out.println("value:"+eachStud.getValue());
			}

		}
	

}
