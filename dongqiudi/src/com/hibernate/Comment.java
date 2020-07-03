package com.hibernate;

/**
 * Comment entity. @author MyEclipse Persistence Tools
 */

public class Comment implements java.io.Serializable {

	// Fields

	private CommentId id;

	// Constructors

	/** default constructor */
	public Comment() {
	}

	/** full constructor */
	public Comment(CommentId id) {
		this.id = id;
	}

	// Property accessors

	public CommentId getId() {
		return this.id;
	}

	public void setId(CommentId id) {
		this.id = id;
	}

}