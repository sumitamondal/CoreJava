package collections;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<Integer,String> map1=new HashMap<Integer,String>();
		
		map1.put(1, "Matt");
		map1.put(2, "Kate");
		map1.put(3, "John");
		map1.put(4, "Kathy");
		map1.put(5, "Matt");
		map1.put(100, "Naveen");
		System.out.println(map1);
		map1.put(2,"Arpita");     //replacing the 2nd key value
		System.out.println(map1);
		
		System.out.println("The 4th key value is "+ map1.get(4));
		System.out.println("The 4th key value is "+ map1.get(100));
		
		map1.remove(100);
		System.out.println("After removing "+map1);
		
		map1.put(100,"Naveen");
		
		for(Integer k: map1.keySet()) {
			System.out.println("The Key is "+ k);
			System.out.println("The value is "+map1.get(k));
		}
		
	}

}
