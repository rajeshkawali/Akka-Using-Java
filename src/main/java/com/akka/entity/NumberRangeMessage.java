package com.akka.entity;

import java.io.Serializable;

public class NumberRangeMessage implements Serializable {

	private static final long serialVersionUID = 1L;
	private long startNumber;
	private long endNumber;

	public NumberRangeMessage(long startNumber, long endNumber) {
		this.startNumber = startNumber;
		this.endNumber = endNumber;
	}

	public long getStartNumber() {
		return startNumber;
	}

	public void setStartNumber(long startNumber) {
		this.startNumber = startNumber;
	}

	public long getEndNumber() {
		return endNumber;
	}

	public void setEndNumber(long endNumber) {
		this.endNumber = endNumber;
	}
}