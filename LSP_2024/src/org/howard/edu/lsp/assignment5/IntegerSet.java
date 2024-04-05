package org.howard.edu.lsp.assignment5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/**
 * Name: Sameer Acharya
 * 
 * This package implements and tests an IntegerSet implemented using an ArrayList
 */

public class IntegerSet {
	private ArrayList<Integer> set = new ArrayList<Integer>();
	
	/**
	 * Default Constructor: Creates an IntegerSet Class and sets the internal ArrayList as an empty list
	 */
	public IntegerSet() {
		
	}
	
	/**
	 * Constructor that initializes a new IntegerSet using the Array List provided.
	 * @param set An ArrayList<Integer> type which could have duplicate elements, which serves as a initial collection from which the IntegerSet is populated.
	 * When creating a set, any duplicates in the parameter set are removed. 
	 *
	 */
	public IntegerSet(ArrayList<Integer> set) {
		for (int val: set) {
			this.add(val);
		}
	}
	
	
	/**
	 * Remove all elements from the current set.
	 * This is an in-place modifier and doesn't return any value.
	 */
	public void clear() {
		this.set.clear();
	}
	
	/**
	 * Returns the number of elements in the set.
	 * @return The size of the set, which is an Integer.
	 */
	public int length() {
		return this.set.size();
	}
	
	/**
	 * Serves as an internal function. Useful for iterating the set to get elements one by one.
	 * @return An Iterator<Integer> that can be used to access the elements of the set sequentially.
	 */
	private Iterator<Integer> getNext() {
		return this.set.iterator();
	}
	
	
	/**
	 * Compares the current set with another set for equality.
	 * Two sets are considered equal if they contain the same elements in any order.
	 * @param set An IntegerSet to be compared with the current set
	 * @return A Boolean which is true if the sets are equal, false otherwise.
	 */

	public boolean equals(IntegerSet set) {
		if (set.length() != this.set.size()) {
			return false;
		}
		HashMap<Integer, Integer> comparer = new HashMap<>();
        HashMap<Integer, Integer> comparee = new HashMap<>();
        
        Iterator<Integer> iterate_comparee = this.getNext();
        while (iterate_comparee.hasNext()) {
        	int curr = iterate_comparee.next();
        	if (comparee.containsKey(curr)) {
        		comparee.put(curr, comparee.get(curr) + 1);
        	} else {
        		comparee.put(curr,  1);
        	}
        }
        
        Iterator<Integer> iterate_comparer = set.getNext();
        while (iterate_comparer.hasNext()) {
        	int curr = iterate_comparer.next();
        	if (comparer.containsKey(curr)) {
        		comparer.put(curr, comparer.get(curr) + 1);
        	} else {
        		comparer.put(curr,  1);
        	}
        }

        
        for (Integer key: comparee.keySet() ) {
        	if (!comparer.containsKey(key) || comparer.get(key) != comparer.get(key)) {
        		return false;
        	}
        }
        return true;
	}
	
	/**
	 * Checks if the set has a certain value.
	 * 
	 * @param value The Integer value which we search in the set.
	 * @return true if the value is present in the set, false otherwise.
	 */
	public boolean contains(int value) {
		return this.set.contains(value);
	}
	
	
	/**
	 * Finds the largest element present in the set.
	 * Throws IntegerSetException if the set is empty.
	 * 
	 * @return The largest integer in the set.
	 * @throws IntegerSetException if the set is empty.
	 */
	public int largest() throws IntegerSetException {
		if (this.isEmpty()) {
			throw new IntegerSetException("Set must not be empty!");
		}
		int curr_max = this.set.get(0);
		for (int val: this.set) {
			if (val > curr_max) {
				curr_max = val;
			}
		}
		return curr_max;
	}
	
	/**
	 * Finds the smallest element present in the set.
	 * Throws IntegerSetException if the set is empty.
	 * 
	 * @return The smallest integer in the set.
	 * @throws IntegerSetException if the set is empty.
	 */
	public int smallest() throws IntegerSetException {
		if (this.isEmpty()) {
			throw new IntegerSetException("Set must not be empty!");
		}
		int curr_min = this.set.get(0);
		for (int val: this.set) {
			if (val < curr_min) {
				curr_min = val;
			}
		}
		return curr_min;
	}
	
	/**
	 * Adds an item to the set. If the item already exists, it is not added again. Doesn't return any value.
	 * Time Complexity: O(N), which is because we need to check if the item to be added is already in the set.
	 * @param item The integer value to be added to the set.
	 */
	public void add(int item) {
		if (!this.contains(item)) {
			this.set.add(item);
		}
	}
	
	/**
	 * Removes an item from the set. If the item doesn't exist, it does nothing. Doesn't return any value.
	 * Time Complexity: O(N)
	 * @param item The integer value to be removed from the set. It's NOT the index to remove the element from.
	 * 
	 */
	public void remove(int item) {
		if (this.contains(item)) {
			this.set.remove(Integer.valueOf(item)); // If we just pass item instead of Integer.valueOf(item), remove will interpret as index.
		}
	}
	
	
	/**
	 * Performs the union operation on this set with another set. This operation adds all elements
	 * from the specified set to the current set.
	 * Doesn't return any value.
	 * @param intSetb The IntegerSet with which we union the current set.
	 * Modifies the current set in-place.
	 */
	public void union(IntegerSet intSetb) {
		Iterator<Integer> iterate_setb = intSetb.getNext();
		while(iterate_setb.hasNext()) {
			this.add(iterate_setb.next());
		}
	}
	
	/**
	 * Performs the intersection operation on this set with another set. This operation removes all elements
	 * from the current set that are not in the set provided as an argument.
	 * Doesn't return any value.
	 * @param intSetb The IntegerSet with which we intersect the current set.
	 */
	public void intersect(IntegerSet intSetb) {
		Iterator<Integer> iterate_curr = this.getNext();
		ArrayList<Integer> newSet = new ArrayList<>();
		while(iterate_curr.hasNext()) {
			int curr_ele = iterate_curr.next();
			if (intSetb.contains(curr_ele)) {
				newSet.add(curr_ele);
			}
		}
		this.set = newSet;
	}
	
	/**
	 * Takes the difference of the current set with another set. This operation removes all elements
	 * from the current set that are also in the set provided to us in the argument.
	 * Doesn't return any value.
	 * @param intSetb The IntegerSet with which we take the difference of our current set.
	 */
	public void diff(IntegerSet intSetb) {
		Iterator<Integer> iterate_curr = this.getNext();		
		ArrayList<Integer> newSet = new ArrayList<>();

		while(iterate_curr.hasNext()) {
			int curr_ele = iterate_curr.next();
			if (!intSetb.contains(curr_ele)) {
				newSet.add(curr_ele);
			}
		}
		this.set = newSet;
	}
	
	/**
	 * Takes the complement of the current set with another set. 
	 * Doesn't return any value.
	 * @param intSetb The IntegerSet with which we take the difference of our current set.
	 * Basically performs intSetb diff current set.
	 */
	public void complement(IntegerSet intSetb) {
		IntegerSet newIntegerSet = new IntegerSet(this.set);
		
		this.union(intSetb);
		this.diff(newIntegerSet);
	}
	
	
	/**
	 * Checks if the length of the set is 0 or if the set is empty.
	 * 
	 * @return true if the set contains no elements, false otherwise.
	 */

	public boolean isEmpty() {
		return this.length() == 0;
	}
	
	
	/**
	 * Returns a string representation of the set.
	 * 
	 * @return A string that lists all elements in the set inside of square brackets and separated by commas.
	 *
	 */

	public String toString() {
		return this.set.toString();
	}	
}
