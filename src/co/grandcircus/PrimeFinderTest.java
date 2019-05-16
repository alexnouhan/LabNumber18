package co.grandcircus;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeFinderTest {
	
	PrimeFinder p = new PrimeFinder();

	@Test
	void test1() {
		assertEquals(2, p.find(1));
	}
	
	@Test
	void test2() {
		assertEquals(3, p.find(2));
	}
	
	@Test
	void test3() {
		assertEquals(5, p.find(3));
	}
	
	@Test
	void test4() {
		assertEquals(7, p.find(4));
	}
	
	@Test
	void test5() {
		assertEquals(11, p.find(5));
	}
	
	@Test
	void test6() {
		assertEquals(13, p.find(6));
	}
	
	@Test
	void test7() {
		assertEquals(17, p.find(7));
	}
	
	@Test
	void test20() {
		assertEquals(71, p.find(20));
	}
}
