package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String[] Array1= {"abc", "pqr", "xyz"};
		
		ArrayList<String> list1=new ArrayList<String>();
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list1.add("Jhon");
		list1.add("Mallika");
		list1.add("Priyanka");
		list1.add("Sumita");
		
		list2.add(125);
		list2.add(900);
		list2.add(387);
		System.out.println("The list is " +list1);
		System.out.println("The size of the list is " +list1.size());
		
		list1.remove(2);
		
		System.out.println("The list is " +list2);
		System.out.println("The size of the list is " +list2.size());
		System.out.println("The 2nd number in the list is " +list2.get(1));
	
		list1.set(1, "Arpita");
		
		
		System.out.println("The list is after replacing " +list1);
		
		list1.add(1,"Mallika");
		System.out.println("The list is after adding again " +list1);
		
		Collections.sort(list1);
		System.out.println("The list is after replacing " +list1);
		
		for(int index=0;index<list1.size();index++) {
			System.out.println("The names are" +list1.get(index));
			
			
		}
		
		for(String name:list1) {
			System.out.println(" The names are " + name);
		}
		
		for(int index=0;index<list1.size();index++) {
						
			
			if(list1.get(index).equals("Priyanka")){
				System.out.println("The position is "+ index);
				break;
			}
	}

	}
}
