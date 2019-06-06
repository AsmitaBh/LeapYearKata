package com.bnppf.kata.leapyear;

import static com.bnppf.kata.leapyear.DivisionBase.*;

public class LeapYear {

	public boolean isLeapYear(int year) {
		return (isMultipleOf400(year) || (isMultipleOf4(year) && isNotMiltipleOf100(year)));
	}

	private boolean isNotMiltipleOf100(int year) {
		return !isMultipleOf(year, HUNDRED);
	}

	private boolean isMultipleOf4(int year) {
		return isMultipleOf(year, FOUR);
	}

	private boolean isMultipleOf400(int year) {
		return isMultipleOf(year, FOUR_HUNDRED);
	}
	
	private boolean isMultipleOf(int year, DivisionBase base) {
		return year % base.getBase() == 0;
	}

}
