package com.hibernate;

/**
 * ReplyId entity. @author MyEclipse Persistence Tools
 */

public class ReplyId implements java.io.Serializable {

	// Fields

	private String userId;
	private String replyuserId;
	private String content;
	private String createtime;

	// Constructors

	/** default constructor */
	public ReplyId() {
	}

	/** full constructor */
	public ReplyId(String userId, String replyuserId, String content, String createtime) {
		this.userId = userId;
		this.replyuserId = replyuserId;
		this.content = content;
		this.createtime = createtime;
	}

	// Property accessors

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getReplyuserId() {
		return this.replyuserId;
	}

	public void setReplyuserId(String replyuserId) {
		this.replyuserId = replyuserId;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ReplyId))
			return false;
		ReplyId castOther = (ReplyId) other;

		return ((this.getUserId() == castOther.getUserId()) || (this.getUserId() != null
				&& castOther.getUserId() != null && this.getUserId().equals(castOther.getUserId())))
				&& ((this.getReplyuserId() == castOther.getReplyuserId())
						|| (this.getReplyuserId() != null && castOther.getReplyuserId() != null
								&& this.getReplyuserId().equals(castOther.getReplyuserId())))
				&& ((this.getContent() == castOther.getContent()) || (this.getContent() != null
						&& castOther.getContent() != null && this.getContent().equals(castOther.getContent())))
				&& ((this.getCreatetime() == castOther.getCreatetime())
						|| (this.getCreatetime() != null && castOther.getCreatetime() != null
								&& this.getCreatetime().equals(castOther.getCreatetime())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getUserId() == null ? 0 : this.getUserId().hashCode());
		result = 37 * result + (getReplyuserId() == null ? 0 : this.getReplyuserId().hashCode());
		result = 37 * result + (getContent() == null ? 0 : this.getContent().hashCode());
		result = 37 * result + (getCreatetime() == null ? 0 : this.getCreatetime().hashCode());
		return result;
	}

}