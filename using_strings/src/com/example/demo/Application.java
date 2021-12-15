package com.example.demo;

public class Application {

	public static void main(String[] args) {
		String bestCity="Chennai";
		String prefCity="Chennai";
		System.out.println("Using double equal: "+(bestCity==prefCity));
		System.out.println("Using dot.equals: "+ bestCity.equals(prefCity));

		String greatCity=prefCity;
		System.out.println("Using double equal- comparing greatCity and prefeCity: "+(greatCity==prefCity));
		System.out.println("Using dot.equals- comparing greatCity and prefeCity: "+ greatCity.equals(prefCity));

		System.out.println("****** Using String obj******");
		
		String bestCityObj=new String ("Chennai");
		String prefCityObj=new String ("Chennai");
		System.out.println("Using double equal: "+(bestCityObj == prefCityObj));
		System.out.println("Using dot.equals: "+ bestCityObj.equals(prefCityObj));
		
		System.out.println("SubString: "+StringUtility.getSubString("SelvaDharshini"));
		System.out.println("SubString: "+StringUtility.getSubString("SelvaDharshini", 0, 5));
		System.out.println("checkContains: "+StringUtility.checkContains("Selva@", "@"));
		System.out.println("checkPositionOfChar: "+StringUtility.checkPositionOfChar("Selva", "e"));
		System.out.println("joinTwoStrings: "+StringUtility.joinTwoStrings("Selva", "Dharshini"));
		System.out.println("replaceString: "+StringUtility.replaceString("Dharshini", "Selva"));
		String names="Selva Kanic Sandy";
		String[] values=StringUtility.splitString(names, " ");
		for(String eachValue:values) {
			System.out.println(eachValue);
		}
	}

}
