package com.bnppf.kata.leapyear;

public enum DivisionBase {

	FOUR(4), HUNDRED(100), FOUR_HUNDRED(400);

	private int base;

	private DivisionBase(final int base) {
		this.base = base;
	}

	public int getBase() {
		return this.base;
	}
}
