package com.hibernate;

/**
 * PtsRank entity. @author MyEclipse Persistence Tools
 */

public class PtsRank implements java.io.Serializable {

	// Fields

	private PtsRankId id;

	// Constructors

	/** default constructor */
	public PtsRank() {
	}

	/** full constructor */
	public PtsRank(PtsRankId id) {
		this.id = id;
	}

	// Property accessors

	public PtsRankId getId() {
		return this.id;
	}

	public void setId(PtsRankId id) {
		this.id = id;
	}

}