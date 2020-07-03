package com.hibernate;

/**
 * EfOfChina entity. @author MyEclipse Persistence Tools
 */

public class EfOfChina implements java.io.Serializable {

	// Fields

	private EfOfChinaId id;

	// Constructors

	/** default constructor */
	public EfOfChina() {
	}

	/** full constructor */
	public EfOfChina(EfOfChinaId id) {
		this.id = id;
	}

	// Property accessors

	public EfOfChinaId getId() {
		return this.id;
	}

	public void setId(EfOfChinaId id) {
		this.id = id;
	}

}