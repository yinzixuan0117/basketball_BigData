package com.hibernate;

/**
 * RerankId entity. @author MyEclipse Persistence Tools
 */

public class RerankId implements java.io.Serializable {

	// Fields

	private String ����Rank;
	private String ��ԱPAyer;
	private String ����No;
	private String ���Team;
	private String ����Gp;
	private String �׷�Gs;
	private String �÷�Pts;
	private String ����Reb;
	private String ��������Oreb;
	private String ��������Dreb;
	private String ����ʱ��Min;

	// Constructors

	/** default constructor */
	public RerankId() {
	}

	/** full constructor */
	public RerankId(String ����Rank, String ��ԱPAyer, String ����No, String ���Team, String ����Gp, String �׷�Gs, String �÷�Pts,
			String ����Reb, String ��������Oreb, String ��������Dreb, String ����ʱ��Min) {
		this.����Rank = ����Rank;
		this.��ԱPAyer = ��ԱPAyer;
		this.����No = ����No;
		this.���Team = ���Team;
		this.����Gp = ����Gp;
		this.�׷�Gs = �׷�Gs;
		this.�÷�Pts = �÷�Pts;
		this.����Reb = ����Reb;
		this.��������Oreb = ��������Oreb;
		this.��������Dreb = ��������Dreb;
		this.����ʱ��Min = ����ʱ��Min;
	}

	// Property accessors

	public String get����Rank() {
		return this.����Rank;
	}

	public void set����Rank(String ����Rank) {
		this.����Rank = ����Rank;
	}

	public String get��ԱPAyer() {
		return this.��ԱPAyer;
	}

	public void set��ԱPAyer(String ��ԱPAyer) {
		this.��ԱPAyer = ��ԱPAyer;
	}

	public String get����No() {
		return this.����No;
	}

	public void set����No(String ����No) {
		this.����No = ����No;
	}

	public String get���Team() {
		return this.���Team;
	}

	public void set���Team(String ���Team) {
		this.���Team = ���Team;
	}

	public String get����Gp() {
		return this.����Gp;
	}

	public void set����Gp(String ����Gp) {
		this.����Gp = ����Gp;
	}

	public String get�׷�Gs() {
		return this.�׷�Gs;
	}

	public void set�׷�Gs(String �׷�Gs) {
		this.�׷�Gs = �׷�Gs;
	}

	public String get�÷�Pts() {
		return this.�÷�Pts;
	}

	public void set�÷�Pts(String �÷�Pts) {
		this.�÷�Pts = �÷�Pts;
	}

	public String get����Reb() {
		return this.����Reb;
	}

	public void set����Reb(String ����Reb) {
		this.����Reb = ����Reb;
	}

	public String get��������Oreb() {
		return this.��������Oreb;
	}

	public void set��������Oreb(String ��������Oreb) {
		this.��������Oreb = ��������Oreb;
	}

	public String get��������Dreb() {
		return this.��������Dreb;
	}

	public void set��������Dreb(String ��������Dreb) {
		this.��������Dreb = ��������Dreb;
	}

	public String get����ʱ��Min() {
		return this.����ʱ��Min;
	}

	public void set����ʱ��Min(String ����ʱ��Min) {
		this.����ʱ��Min = ����ʱ��Min;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RerankId))
			return false;
		RerankId castOther = (RerankId) other;

		return ((this.get����Rank() == castOther.get����Rank()) || (this.get����Rank() != null
				&& castOther.get����Rank() != null && this.get����Rank().equals(castOther.get����Rank())))
				&& ((this.get��ԱPAyer() == castOther.get��ԱPAyer()) || (this.get��ԱPAyer() != null
						&& castOther.get��ԱPAyer() != null && this.get��ԱPAyer().equals(castOther.get��ԱPAyer())))
				&& ((this.get����No() == castOther.get����No()) || (this.get����No() != null && castOther.get����No() != null
						&& this.get����No().equals(castOther.get����No())))
				&& ((this.get���Team() == castOther.get���Team()) || (this.get���Team() != null
						&& castOther.get���Team() != null && this.get���Team().equals(castOther.get���Team())))
				&& ((this.get����Gp() == castOther.get����Gp()) || (this.get����Gp() != null && castOther.get����Gp() != null
						&& this.get����Gp().equals(castOther.get����Gp())))
				&& ((this.get�׷�Gs() == castOther.get�׷�Gs()) || (this.get�׷�Gs() != null && castOther.get�׷�Gs() != null
						&& this.get�׷�Gs().equals(castOther.get�׷�Gs())))
				&& ((this.get�÷�Pts() == castOther.get�÷�Pts()) || (this.get�÷�Pts() != null
						&& castOther.get�÷�Pts() != null && this.get�÷�Pts().equals(castOther.get�÷�Pts())))
				&& ((this.get����Reb() == castOther.get����Reb()) || (this.get����Reb() != null
						&& castOther.get����Reb() != null && this.get����Reb().equals(castOther.get����Reb())))
				&& ((this.get��������Oreb() == castOther.get��������Oreb()) || (this.get��������Oreb() != null
						&& castOther.get��������Oreb() != null && this.get��������Oreb().equals(castOther.get��������Oreb())))
				&& ((this.get��������Dreb() == castOther.get��������Dreb()) || (this.get��������Dreb() != null
						&& castOther.get��������Dreb() != null && this.get��������Dreb().equals(castOther.get��������Dreb())))
				&& ((this.get����ʱ��Min() == castOther.get����ʱ��Min()) || (this.get����ʱ��Min() != null
						&& castOther.get����ʱ��Min() != null && this.get����ʱ��Min().equals(castOther.get����ʱ��Min())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (get����Rank() == null ? 0 : this.get����Rank().hashCode());
		result = 37 * result + (get��ԱPAyer() == null ? 0 : this.get��ԱPAyer().hashCode());
		result = 37 * result + (get����No() == null ? 0 : this.get����No().hashCode());
		result = 37 * result + (get���Team() == null ? 0 : this.get���Team().hashCode());
		result = 37 * result + (get����Gp() == null ? 0 : this.get����Gp().hashCode());
		result = 37 * result + (get�׷�Gs() == null ? 0 : this.get�׷�Gs().hashCode());
		result = 37 * result + (get�÷�Pts() == null ? 0 : this.get�÷�Pts().hashCode());
		result = 37 * result + (get����Reb() == null ? 0 : this.get����Reb().hashCode());
		result = 37 * result + (get��������Oreb() == null ? 0 : this.get��������Oreb().hashCode());
		result = 37 * result + (get��������Dreb() == null ? 0 : this.get��������Dreb().hashCode());
		result = 37 * result + (get����ʱ��Min() == null ? 0 : this.get����ʱ��Min().hashCode());
		return result;
	}

}