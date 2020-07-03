package com.hibernate;

/**
 * Sheet2 entity. @author MyEclipse Persistence Tools
 */

public class Sheet2 implements java.io.Serializable {

	// Fields

	private Sheet2Id id;

	// Constructors

	/** default constructor */
	public Sheet2() {
	}

	/** full constructor */
	public Sheet2(Sheet2Id id) {
		this.id = id;
	}

	// Property accessors

	public Sheet2Id getId() {
		return this.id;
	}

	public void setId(Sheet2Id id) {
		this.id = id;
	}

}