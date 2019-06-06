package com.bnppf.kata.leapyear;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class LeapYearTest {
	
	private LeapYear leapYear;

	@BeforeEach
	public void setUp() throws Exception {
		leapYear = new LeapYear();
	}
	
	@ParameterizedTest
	@ValueSource(ints = { 2000, 2400 })
	public void whenDivisibleBy400ThenLeapYear(int year) {
		assertTrue(leapYear.isLeapYear(year));
	}
	
	@Test
	public void when2001ThenNonLeapYear() {
		assertFalse(leapYear.isLeapYear(2001));
	}
	
	@ParameterizedTest
	@ValueSource(ints = { 1700, 1800, 1900, 2100 })
	public void whenDivisibleBy100ButNotBy400ThenNonLeapYear(int year) {
		assertFalse(leapYear.isLeapYear(year));
	}
	
	@ParameterizedTest
	@ValueSource(ints = { 2008, 2012, 2016 })
	public void whenDivisibleBy4ButNotBy100ThenLeapYear(int year) {
		assertTrue(leapYear.isLeapYear(year));
	}
	
	@ParameterizedTest
	@ValueSource(ints = { 2017, 2018, 2019 })
    public void whenNotDivisibleBy4ThenNonLeapYear(int year){
        assertFalse(leapYear.isLeapYear(year));
    }

}
