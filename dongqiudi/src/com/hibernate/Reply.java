package com.hibernate;

/**
 * Reply entity. @author MyEclipse Persistence Tools
 */

public class Reply implements java.io.Serializable {

	// Fields

	private ReplyId id;

	// Constructors

	/** default constructor */
	public Reply() {
	}

	/** full constructor */
	public Reply(ReplyId id) {
		this.id = id;
	}

	// Property accessors

	public ReplyId getId() {
		return this.id;
	}

	public void setId(ReplyId id) {
		this.id = id;
	}

}