package com.hibernate;

/**
 * Oridata entity. @author MyEclipse Persistence Tools
 */

public class Oridata implements java.io.Serializable {

	// Fields

	private OridataId id;

	// Constructors

	/** default constructor */
	public Oridata() {
	}

	/** full constructor */
	public Oridata(OridataId id) {
		this.id = id;
	}

	// Property accessors

	public OridataId getId() {
		return this.id;
	}

	public void setId(OridataId id) {
		this.id = id;
	}

}