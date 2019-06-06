package com.bnppf.kata.leapyear;

public class LeapYear {

	public boolean isLeapYear(int year) {
		return (isMultipleOf400(year) || (isMultipleOf4(year) && isNotMiltipleOf100(year)));
	}

	private boolean isNotMiltipleOf100(int year) {
		return year%100 != 0;
	}

	private boolean isMultipleOf4(int year) {
		return year%4 == 0;
	}

	private boolean isMultipleOf400(int year) {
		return year%400 == 0;
	}

}
