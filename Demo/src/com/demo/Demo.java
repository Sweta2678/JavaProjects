package com.demo;

import java.util.HashMap;

public class Demo {
	public static void main(String[] args) {
		
//		final Multimap<String, String> cars = ArrayListMultimap.create();
//	    cars.put("Nissan", "Qashqai");
//	    cars.put("Nissan", "Juke");
//	    cars.put("Bmw", "M3");
//	    cars.put("Bmw", "330E");
//	    cars.put("Bmw", "X6");
//	    cars.put("Bmw", "X5");
//
//	    cars.get("Bmw").forEach(System.out::println);
//
//		
//
//		Map<String, List<String>> map = new HashMap<>();
//
//		put(map, "first", "hello");
//		put(map, "first", "foo");
//		put(map, "bar", "foo");
//		put(map, "first", "hello");
//
//		map.forEach((s, strings) -> {
//			System.out.print(s + ": ");
//			System.out.println(strings.stream().collect(Collectors.joining(", ")));
//		});
//	}
//
//	private static <KEY, VALUE> void put(Map<KEY, List<VALUE>> map, KEY key, VALUE value) {
//		map.compute(key, (s, strings) -> strings == null ? new ArrayList<>() : strings).add(value);
//	}

				// Creating an empty HashMap 
				HashMap<String, Integer> hash_map = new HashMap<String, Integer>(); 

				// Mapping int values to string keys 
				hash_map.put("Geeks", 10); 
				hash_map.put("4", 15); 
				hash_map.put("Geeksss", 10); 
				hash_map.put("Welcomes", 25); 
				hash_map.put("You", 30); 

				// Displaying the HashMap 
				System.out.println("Initial Mappings are: " + hash_map); 

				// Getting the value of "Geeks" 
				System.out.println("The Value is: " + hash_map.get(10)); 

				// Getting the value of "You" 
				System.out.println("The Value is: " + hash_map.get("You")); 
			} 
}
