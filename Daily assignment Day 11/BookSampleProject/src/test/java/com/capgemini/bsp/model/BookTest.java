package com.capgemini.bsp.model;

/**
 * 
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author ASUS
 *
 */
class BookTest {
	
	static Book b;
	static Book b1;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		b = new Book(12, "Keshu", 100.00);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		b = null;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		b1 = new Book(0, null, 0);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		b1 = null;
	}

	/**
	 * Test method 
	 */
	@Test
	void testBook() {
		assertEquals(new Book(0, null, 0), b1);
	}

	/**
	 * Test method 
	 */
	@Test
	void testGetBid() {
		assertEquals(12, b.getBid());
	}

	/**
	 * Test method 
	 */
	@Test
	void testGetBname() {
		assertEquals("Keshu", b.getBname());
	}

	/**
	 * Test method 
	 */
	@Test
	void testGetPrice() {
		assertEquals(100.00, b.getPrice());
	}

}
