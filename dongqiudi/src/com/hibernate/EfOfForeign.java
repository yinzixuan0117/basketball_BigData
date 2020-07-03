package com.hibernate;

/**
 * EfOfForeign entity. @author MyEclipse Persistence Tools
 */

public class EfOfForeign implements java.io.Serializable {

	// Fields

	private EfOfForeignId id;

	// Constructors

	/** default constructor */
	public EfOfForeign() {
	}

	/** full constructor */
	public EfOfForeign(EfOfForeignId id) {
		this.id = id;
	}

	// Property accessors

	public EfOfForeignId getId() {
		return this.id;
	}

	public void setId(EfOfForeignId id) {
		this.id = id;
	}

}