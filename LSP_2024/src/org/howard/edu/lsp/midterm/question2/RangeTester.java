package org.howard.edu.lsp.midterm.question2;

public class RangeTester {
	public static void main(String[] args) {
		IntegerRange range1 = new IntegerRange(4, 5);
		Range range2 = new IntegerRange(5, 6);
		
		System.out.println("Range 1: " + range1.toString() + " Range 2: " + range2.toString());
		System.out.println("Range1 == Range2? " + range1.equals(range2));
		System.out.println("Range1 overlaps Range2? " + range1.overlaps(range2));
		
		
		range1.setLowerBound(5);
		range1.setUpperBound(6);
		
		
		System.out.println("Range 1: " + range1.toString() + " Range 2: " + range2.toString());
		System.out.println("Range1 == Range2? " + range1.equals(range2));
		

	}
}
