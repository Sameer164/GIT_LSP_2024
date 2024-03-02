package org.howard.edu.lsp.assignment4;
import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {
		IntegerSet set1 = new IntegerSet();

		System.out.println("Testing contains, add, and isEmpty functions.");
		System.out.println("Value of set1 is: " + set1.toString());
		System.out.println("Is set1 empty? " + set1.isEmpty());
		System.out.println("Adding 1");
		set1.add(1);
		System.out.println("Adding 2");
		set1.add(2);
		System.out.println("Value of set1 is: " + set1.toString());
		
		System.out.println("Is 3 in set1? " + set1.contains(3));
		System.out.println("Is 2 in set1? " + set1.contains(2));
		
		System.out.println("Is set1 empty? " + set1.isEmpty());
		System.out.println("=====================================================================");

		
		System.out.println("Testing Error Handling and Length function.");
		System.out.println("Clearing set1");
		set1.clear();
		System.out.println("Value of set1 is: " + set1.toString());
		// Checking the smallest element when the set is empty. 
		System.out.println("The length of set1 is: " + set1.length());
		System.out.println("Trying to find the smallest element in the set.");
		try {
			System.out.println("The smallest element of set1 is: " + set1.smallest());
		} catch (IntegerSetException i) {
			System.out.println("IntegerSetException Raised: The set was empty");
		}
		
		System.out.println("=====================================================================");
		
		System.out.println("Testing the smallest and largest functions");
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		System.out.println("Value of set1 is: " + set1.toString());
		
		try {
		System.out.println("Smallest value in set1 is: " + set1.smallest());
		System.out.println("Largest value in set1 is: " + set1.largest());
		} catch (IntegerSetException i) {
			System.out.println("The set is empty!");
		}
		
		System.out.println("=====================================================================");
		
		System.out.println("Testing the union and Intersection functions");
		
		
		IntegerSet set2 = new IntegerSet();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		System.out.println("Value of set1 is: " + set1.toString());
		System.out.println("Value of set2 is: " + set2.toString());
		set1.union(set2);
		System.out.println("Union of Set1 and Set2 is: " + set1.toString());
		
		set1.remove(4);
		set1.remove(5);
		set1.intersect(set2);
		
		System.out.println("Intersection of Set1 and Set 2 is: " + set1.toString());
		
		System.out.println("=====================================================================");

		
		
		System.out.println("Testing the Complement function.");
		
		set1.add(1);
		set1.add(2);
		System.out.println("Value of set1 is: " + set1.toString());
		System.out.println("Value of set2 is: " + set2.toString());
		set1.complement(set2);
		System.out.println("Value of set1 complement set2 is: " + set1.toString());
		
		System.out.println("=====================================================================");

		System.out.println("Testing the diff function.");
		set1.add(1);
		set1.add(2);
		set1.add(3);
		System.out.println("Value of set1 is: " + set1.toString());
		System.out.println("Value of set2 is: " + set2.toString());
		set1.diff(set2);
		System.out.println("Value of set1 diff set2 is: " + set1.toString());
		System.out.println("=====================================================================");

		System.out.println("Testing The uniqueness of elements in the set.");
		
		System.out.println("Value of set1 is: " + set1.toString());
		System.out.println("Adding 3");
		set1.add(3);
		System.out.println("Value of set1 is: " + set1.toString());
		System.out.println("Adding 1 again");

		set1.add(1);
		System.out.println("Adding 2 again");

		set2.add(2);
		System.out.println("Adding 2 again");

		set1.add(2);
		System.out.println("Adding 1 again");

		set1.add(1);
		
		System.out.println("Value of set1 is still: " + set1.toString());
		
		System.out.println("=====================================================================");

		
		System.out.println("Testing the remove function.");
		System.out.println("Value of set1 is: " + set1.toString());
		System.out.println("Removing 5 (a non-existent element) from the set.");
		set1.remove(5);
		System.out.println("Value of set1 is: " + set1.toString());
		set1.remove(2);
		System.out.println("Removing 2 from the set.");
		
		System.out.println("Value of set1 is: " + set1.toString());
		
		System.out.println("=====================================================================");

		System.out.println("Testing the non-default constructor (Initialization with an ArrayList)");
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		System.out.println("The list with which we are initializing the set3 is: " + list.toString());
		
		IntegerSet set3 = new IntegerSet(list);
		System.out.println("Value of set3 is: " + set3.toString());
		
		System.out.println("=====================================================================");

		System.out.println("Testing the Equality and Clearing of Sets");
		set1.add(2);
		System.out.println("Value of set1 is: " + set1.toString());
		System.out.println("Value of set3 is: " + set3.toString());
		System.out.println("set1 == set3? " + set1.equals(set3));
		set3.add(4);
		System.out.println("Value of set3 is: " + set3.toString());
		System.out.println("set1 == set3? " + set1.equals(set3));
		set3.remove(4);
		set1.remove(2);
		set1.add(5);
		System.out.println("Value of set1 is: " + set1.toString());
		System.out.println("Value of set3 is: " + set3.toString());
		System.out.println("set1 == set3? " + set1.equals(set3));
		set3.remove(2);
		System.out.println("Value of set1 is: " + set1.toString());
		System.out.println("Value of set3 is: " + set3.toString());
		System.out.println("set1 == set3? " + set1.equals(set3));
		
		System.out.println("Clearing set1");
		System.out.println("Clearing set3");
		set1.clear();
		set3.clear();
		System.out.println("Value of set1 is: " + set1.toString());
		System.out.println("Value of set3 is: " + set3.toString());

		System.out.println("set1 == set3? " + set1.equals(set3));


		
		System.out.println("=====================================================================");

		
		
	}
}
