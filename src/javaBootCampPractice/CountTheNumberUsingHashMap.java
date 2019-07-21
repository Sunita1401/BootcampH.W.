package javaBootCampPractice;

import java.util.HashMap;

public class CountTheNumberUsingHashMap {
//Write a java program to count the number of words in a string using Hashmap
	public static void main(String[] args) {
// Hashmap starts with a key and value
		//hashmap is a part of the collection system
		// value given hashmap can all be duplicated
		//hashmap value allows ull value and null key
		
		HashMap<String,String>CapitalCities= new HashMap<String,String>();
		CapitalCities.put("England", "London");
		CapitalCities.put("India", "Delhi");
		CapitalCities.put("USA", "DC");
		CapitalCities.put("Germany", "Berlin");
		System.out.println(CapitalCities.get("England"));
		
		System.out.println(CapitalCities);

	}

}
