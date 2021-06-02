package com.capgemini.asp.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AuthorTest {

	static Author an;
	static Author an1;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		an = new Author("Keshu", "trivedi.kaushiki@gmail.com", 'f');
	}
	
	@AfterAll
	static void tearDownAll() throws Exception {
		an = null;
	}
	
	@BeforeEach
	void setup() throws Exception {
		an1 = new Author();
	}
	
	@AfterEach
	void tearDown() throws Exception {
		an1 = null;
	}

	@Test
	void testAuthor() {
		assertEquals(new Author(), an1);
	}
	
	@Test
	void testGetName() {
		assertEquals("Keshu", an.getName());
	}
	@Test
	void testGetEmail() {
		assertEquals("trivedi.kaushiki@gmail.com", an.getEmail());
	}
	@Test
	void testGetGender() {
		assertEquals('f', an.getGender());
	}
	
}
