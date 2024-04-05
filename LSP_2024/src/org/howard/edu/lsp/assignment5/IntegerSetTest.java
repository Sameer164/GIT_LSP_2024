package org.howard.edu.lsp.assignment5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IntegerSetTest {
	
	IntegerSet set = new IntegerSet();
	
	
	@Test
	@DisplayName("Test case for add")
	void testAdd() {
		set.add(5);
		assertTrue(set.contains(5));
		set.add(5);
		assertEquals(1, set.length());
		set.add(3);
		assertTrue(set.length() == 2 && set.contains(3));
	}
	
	@Test
	@DisplayName("Test case for contains")
	void testContains() {
		set.add(7);
		assertTrue(set.contains(7));
		set.remove(7);
		assertFalse(set.contains(7));
	}
	
	@Test
	@DisplayName("Test case for clear")
	void testClear() {
		set.add(9);
		set.clear();
		assertEquals(0, set.length());
	}
	
	@Test
	@DisplayName("Test case for length")
	void testLength() {
		set.clear();
		assertEquals(0, set.length());
		set.add(2);
		set.add(3);
		assertEquals(2, set.length());
		set.remove(2);
		assertEquals(1, set.length());
	}
	
	@Test
	@DisplayName("Test case for equals")
	void testEquals() {
		set.clear();
		IntegerSet set2 = new IntegerSet();
		assertTrue(set.equals(set2));
		assertTrue(set2.equals(set));
		
		set.add(5);
		set.add(5);
		assertFalse(set2.equals(set));
		
		set2.add(5);
		assertTrue(set2.equals(set));
		set.add(4);
		set2.add(3);
		set.add(3);
		set2.add(4);
		assertTrue(set2.equals(set));
	}
	
	@Test
	@DisplayName("Test case for remove")
	void testRemove() {
		set.clear();
		set.add(1);
		assertTrue(set.contains(1));
		set.remove(1);
		assertFalse(set.contains(1));
	}
	
	
	@Test
	@DisplayName("Test case for isEmpty")
	void testIsEmpty() {
		set.clear();
		assertEquals(0, set.length());
		assertTrue(set.isEmpty());
		set.add(1);
		assertFalse(set.isEmpty());
	}
	
	@Test
	@DisplayName("Test case for toString")
	void testToString() {
		set.clear();
		assertEquals("[]", set.toString());
		set.add(1);
		assertEquals("[1]", set.toString());
		set.add(2);
		assertEquals("[1, 2]", set.toString());
		set.add(3);
		assertEquals("[1, 2, 3]", set.toString());

	}
	
	
	@Test
	@DisplayName("Test case for union")
	void testUnion() {
	    set.clear();
	    IntegerSet set2 = new IntegerSet();
	    set.add(1);
	    set.add(2);
	    set2.add(2);
	    set2.add(3);
	    set.union(set2);
	    assertTrue(set.contains(1) && set.contains(2) && set.contains(3));
	    assertEquals(3, set.length());
	}


	@Test
	@DisplayName("Test case for intersect")
	void testIntersect() {
	    set.clear();
	    IntegerSet set2 = new IntegerSet();
	    set.add(1);
	    set.add(2);
	    set.add(3);
	    set2.add(2);
	    set2.add(3);
	    set2.add(4);
	    set.intersect(set2);
	    assertTrue(set.contains(2) && set.contains(3));
	    assertEquals(2, set.length());

	}
	
	
	@Test
	@DisplayName("Test case for diff")
	void testDiff() {
	    set.clear();
	    IntegerSet set2 = new IntegerSet();
	    set.add(1);
	    set.add(2);
	    set.add(3);
	    set2.add(2);
	    set2.add(3);
	    set2.add(4);
	    set.diff(set2);
	    assertTrue(set.contains(1));
	    assertEquals(1, set.length());
	}
	
	@Test
	@DisplayName("Test case for complement")
	void testComplement() {
	    set.clear();
	    IntegerSet set2 = new IntegerSet();
	    set.add(1);
	    set.add(2);
	    set2.add(2);
	    set2.add(3);
	    set2.add(4);
	    set.complement(set2);
	    assertTrue(set.contains(3) && set.contains(4));
	    assertEquals(2, set.length());
	}
	
	@Test
	@DisplayName("Test case for largest")
	void testLargest() throws IntegerSetException {
	    set.clear();
	    set.add(-1);
	    set.add(2);
	    set.add(3);
	    set.add(-5);
	    assertEquals(3, set.largest());

	    set.clear();
	    set.add(0);
	    assertEquals(0, set.largest());
	    set.clear();
	    assertThrows(IntegerSetException.class, () -> {
	    	set.largest();
	    });
	}


	@Test
	@DisplayName("Test case for smallest")
	void testSmallest() throws IntegerSetException {
	    set.clear();
	    set.add(1);
	    set.add(2);
	    set.add(3);
	    assertEquals(1, set.smallest());

	    set.clear();
	    set.add(-1);
	    set.add(-2);
	    set.add(-3);
	    assertEquals(-3, set.smallest());

	    set.clear();
	    set.add(0);
	    assertEquals(0, set.smallest());
	    set.clear();
	    assertThrows(IntegerSetException.class, () -> {
	    	set.smallest();
	    });
	}
	
	
}
