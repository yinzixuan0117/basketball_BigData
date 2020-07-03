package com.hibernate;

/**
 * Sheet1 entity. @author MyEclipse Persistence Tools
 */

public class Sheet1 implements java.io.Serializable {

	// Fields

	private Sheet1Id id;

	// Constructors

	/** default constructor */
	public Sheet1() {
	}

	/** full constructor */
	public Sheet1(Sheet1Id id) {
		this.id = id;
	}

	// Property accessors

	public Sheet1Id getId() {
		return this.id;
	}

	public void setId(Sheet1Id id) {
		this.id = id;
	}

}