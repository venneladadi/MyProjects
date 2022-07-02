package Assignment3;

import java.util.HashMap;

public class DemoHashMap {

	public static void main(String[] args) {

	    // create a hashmap
	    HashMap<Integer,String> languages = new HashMap<>();
	    System.out.println("Initial HashMap: " + languages);
	    languages.put(1, "Java");
	    languages.put(2, "Python");
	    languages.put(3, "JavaScript");
	    System.out.println("HashMap: " + languages);

	    // get() method to get value
	    String value = languages.get(1);
	    System.out.println("Value at index 1: " + value);
	    System.out.println("HashMap: " + languages);
	    // return set view of keys
	    // using keySet()
	    System.out.println("Keys: " + languages.keySet());

	    // return set view of values
	    // using values()
	    System.out.println("Values: " + languages.values());

	    // return set view of key/value pairs
	    // using entrySet()
	    System.out.println("Key/Value mappings: " + languages.entrySet());
	    languages.replace(2, "C++");
	    System.out.println("HashMap using replace(): " + languages);
	    String value1 = languages.remove(2);
	    System.out.println("Removed value: " + value1);

	    System.out.println("Updated HashMap: " + languages);

	}

}
