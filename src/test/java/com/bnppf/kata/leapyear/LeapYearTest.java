package com.bnppf.kata.leapyear;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LeapYearTest {
	
	private LeapYear leapYear;

	@BeforeEach
	public void setUp() throws Exception {
		leapYear = new LeapYear();
	}
	
	@Test
	public void when2000ThenLeapYear() {
		assertTrue(leapYear.isLeapYear(2000));
	}
	
	@Test
	public void when2001ThenNonLeapYear() {
		assertFalse(leapYear.isLeapYear(2001));
	}
	
	@Test
	public void when1700ThenNonLeapYear() {
		assertFalse(leapYear.isLeapYear(1700));
	}

}
