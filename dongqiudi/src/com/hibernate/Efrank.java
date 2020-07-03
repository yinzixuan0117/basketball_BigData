package com.hibernate;

/**
 * Efrank entity. @author MyEclipse Persistence Tools
 */

public class Efrank implements java.io.Serializable {

	// Fields

	private EfrankId id;

	// Constructors

	/** default constructor */
	public Efrank() {
	}

	/** full constructor */
	public Efrank(EfrankId id) {
		this.id = id;
	}

	// Property accessors

	public EfrankId getId() {
		return this.id;
	}

	public void setId(EfrankId id) {
		this.id = id;
	}

}