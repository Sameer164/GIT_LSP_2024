package org.howard.edu.lsp.midterm.question2;

/**
 * This class is used to test the functionality of the IntegerRange class.
 */

public class RangeTester {
    /**
     * The main method that executes the testing of the IntegerRange class.
     *
     * @param args command-line arguments (not used)
     */
	public static void main(String[] args) {
        // Create two IntegerRange objects

		IntegerRange range1 = new IntegerRange(4, 5);
		Range range2 = new IntegerRange(5, 6);
		
        // Test equals and overlaps methods
		System.out.println("Range 1: " + range1.toString() + " Range 2: " + range2.toString());
		System.out.println("Range1 == Range2? " + range1.equals(range2));
		System.out.println("Range1 overlaps Range2? " + range1.overlaps(range2));
		
		
        // Modify range1 to have the same bounds as range2
		range1.setLowerBound(5);
		range1.setUpperBound(6);
		
        // Test equals method after modification
		System.out.println("Range 1: " + range1.toString() + " Range 2: " + range2.toString());
		System.out.println("Range1 == Range2? " + range1.equals(range2));
		

	}
}
