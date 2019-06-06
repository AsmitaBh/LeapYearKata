package com.bnppf.kata.leapyear;

import static com.bnppf.kata.leapyear.DivisionBase.*;

public class LeapYear {

	public boolean isLeapYear(int year) {
		return (isMultipleOf400(year) || (isMultipleOf4(year) && isNotMiltipleOf100(year)));
	}

	private boolean isNotMiltipleOf100(int year) {
		return year % HUNDRED.getBase() != 0;
	}

	private boolean isMultipleOf4(int year) {
		return year % FOUR.getBase() == 0;
	}

	private boolean isMultipleOf400(int year) {
		return year % FOUR_HUNDRED.getBase() == 0;
	}

}
