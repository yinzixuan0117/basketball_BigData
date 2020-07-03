package com.hibernate;

/**
 * Sheet3 entity. @author MyEclipse Persistence Tools
 */

public class Sheet3 implements java.io.Serializable {

	// Fields

	private Sheet3Id id;

	// Constructors

	/** default constructor */
	public Sheet3() {
	}

	/** full constructor */
	public Sheet3(Sheet3Id id) {
		this.id = id;
	}

	// Property accessors

	public Sheet3Id getId() {
		return this.id;
	}

	public void setId(Sheet3Id id) {
		this.id = id;
	}

}