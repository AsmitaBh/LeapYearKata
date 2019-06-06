package com.bnppf.kata.leapyear;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class LeapYearTest {
	
	private LeapYear leapYear;

	@Before
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

}