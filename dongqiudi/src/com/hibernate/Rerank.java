package com.hibernate;

/**
 * Rerank entity. @author MyEclipse Persistence Tools
 */

public class Rerank implements java.io.Serializable {

	// Fields

	private RerankId id;

	// Constructors

	/** default constructor */
	public Rerank() {
	}

	/** full constructor */
	public Rerank(RerankId id) {
		this.id = id;
	}

	// Property accessors

	public RerankId getId() {
		return this.id;
	}

	public void setId(RerankId id) {
		this.id = id;
	}

}