package org.howard.edu.lsp.midterm.question2;

/**
 * Implementation of the Range interface representing a range of integers.
 */
public class IntegerRange implements Range {
	
	private int lower_bound;
	private int upper_bound;
	
	/**
	 * Default constructor for IntegerRange
	 * **/
	public IntegerRange() {
		
	}
	
    /**
     * Constructs an IntegerRange with the given lower and upper bounds.
     *
     * @param lowerBound the lower bound of the range
     * @param upperBound the upper bound of the range
     */

	public IntegerRange( int lower_bound, int upper_bound ) {
		this.lower_bound = lower_bound;
		this.upper_bound = upper_bound;
	}
	
	
	/**
	 * Sets the upper bound of the range.
	 *
	 * @param upper_bound the upper bound to set
	 */
	public void setUpperBound( int upper_bound ) {
		this.upper_bound = upper_bound;
	}
	
	/**
	 * Sets the lower bound of the range.
	 *
	 * @param lower_bound the lower bound to set
	 */
	public void setLowerBound( int lower_bound ) {
		this.lower_bound = lower_bound;
	}
	
    /**
     * Checks if the range contains a specific value.
     *
     * @param value the value to check
     * @return true if the value is within the range, false otherwise
     */
	@Override
	public boolean contains( int value ) {
		return (value >= this.lower_bound && value <= this.upper_bound);
	}
	
    /**
     * Checks if the range overlaps with another range.
     *
     * @param other the other range to check overlap with
     * @return true if there is an overlap, false otherwise
     */

	@Override
	public boolean overlaps( Range other ) {
		return (other.contains(lower_bound) || other.contains(upper_bound) || other.overlaps(this));
	}
	
    /**
     * Returns the number of integers in the range.
     *
     * @return the size of the range
     */
	@Override
	public int size() {
		return this.upper_bound - this.lower_bound + 1;
	}
	
	/**
	 * Checks if this range is equal to another range.
	 *
	 * @param other the other range to compare
	 * @return true if the ranges are equal, false otherwise
	 */
	public boolean equals( Range other ) {
		return other.contains(this.lower_bound) && other.contains(this.upper_bound) && other.size() == this.size();
	}
	
	/**
	 * Returns a string representation of the range.
	 *
	 * @return a string representation of the range
	 */
	public String toString() {
		return "[ " + this.lower_bound + ", " + this.upper_bound + " ]"; 
	}

}
