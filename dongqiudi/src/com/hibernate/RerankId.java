package com.hibernate;

/**
 * RerankId entity. @author MyEclipse Persistence Tools
 */

public class RerankId implements java.io.Serializable {

	// Fields

	private String 排名Rank;
	private String 球员PAyer;
	private String 号码No;
	private String 球队Team;
	private String 场次Gp;
	private String 首发Gs;
	private String 得分Pts;
	private String 篮板Reb;
	private String 进攻篮板Oreb;
	private String 防守篮板Dreb;
	private String 出场时间Min;

	// Constructors

	/** default constructor */
	public RerankId() {
	}

	/** full constructor */
	public RerankId(String 排名Rank, String 球员PAyer, String 号码No, String 球队Team, String 场次Gp, String 首发Gs, String 得分Pts,
			String 篮板Reb, String 进攻篮板Oreb, String 防守篮板Dreb, String 出场时间Min) {
		this.排名Rank = 排名Rank;
		this.球员PAyer = 球员PAyer;
		this.号码No = 号码No;
		this.球队Team = 球队Team;
		this.场次Gp = 场次Gp;
		this.首发Gs = 首发Gs;
		this.得分Pts = 得分Pts;
		this.篮板Reb = 篮板Reb;
		this.进攻篮板Oreb = 进攻篮板Oreb;
		this.防守篮板Dreb = 防守篮板Dreb;
		this.出场时间Min = 出场时间Min;
	}

	// Property accessors

	public String get排名Rank() {
		return this.排名Rank;
	}

	public void set排名Rank(String 排名Rank) {
		this.排名Rank = 排名Rank;
	}

	public String get球员PAyer() {
		return this.球员PAyer;
	}

	public void set球员PAyer(String 球员PAyer) {
		this.球员PAyer = 球员PAyer;
	}

	public String get号码No() {
		return this.号码No;
	}

	public void set号码No(String 号码No) {
		this.号码No = 号码No;
	}

	public String get球队Team() {
		return this.球队Team;
	}

	public void set球队Team(String 球队Team) {
		this.球队Team = 球队Team;
	}

	public String get场次Gp() {
		return this.场次Gp;
	}

	public void set场次Gp(String 场次Gp) {
		this.场次Gp = 场次Gp;
	}

	public String get首发Gs() {
		return this.首发Gs;
	}

	public void set首发Gs(String 首发Gs) {
		this.首发Gs = 首发Gs;
	}

	public String get得分Pts() {
		return this.得分Pts;
	}

	public void set得分Pts(String 得分Pts) {
		this.得分Pts = 得分Pts;
	}

	public String get篮板Reb() {
		return this.篮板Reb;
	}

	public void set篮板Reb(String 篮板Reb) {
		this.篮板Reb = 篮板Reb;
	}

	public String get进攻篮板Oreb() {
		return this.进攻篮板Oreb;
	}

	public void set进攻篮板Oreb(String 进攻篮板Oreb) {
		this.进攻篮板Oreb = 进攻篮板Oreb;
	}

	public String get防守篮板Dreb() {
		return this.防守篮板Dreb;
	}

	public void set防守篮板Dreb(String 防守篮板Dreb) {
		this.防守篮板Dreb = 防守篮板Dreb;
	}

	public String get出场时间Min() {
		return this.出场时间Min;
	}

	public void set出场时间Min(String 出场时间Min) {
		this.出场时间Min = 出场时间Min;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RerankId))
			return false;
		RerankId castOther = (RerankId) other;

		return ((this.get排名Rank() == castOther.get排名Rank()) || (this.get排名Rank() != null
				&& castOther.get排名Rank() != null && this.get排名Rank().equals(castOther.get排名Rank())))
				&& ((this.get球员PAyer() == castOther.get球员PAyer()) || (this.get球员PAyer() != null
						&& castOther.get球员PAyer() != null && this.get球员PAyer().equals(castOther.get球员PAyer())))
				&& ((this.get号码No() == castOther.get号码No()) || (this.get号码No() != null && castOther.get号码No() != null
						&& this.get号码No().equals(castOther.get号码No())))
				&& ((this.get球队Team() == castOther.get球队Team()) || (this.get球队Team() != null
						&& castOther.get球队Team() != null && this.get球队Team().equals(castOther.get球队Team())))
				&& ((this.get场次Gp() == castOther.get场次Gp()) || (this.get场次Gp() != null && castOther.get场次Gp() != null
						&& this.get场次Gp().equals(castOther.get场次Gp())))
				&& ((this.get首发Gs() == castOther.get首发Gs()) || (this.get首发Gs() != null && castOther.get首发Gs() != null
						&& this.get首发Gs().equals(castOther.get首发Gs())))
				&& ((this.get得分Pts() == castOther.get得分Pts()) || (this.get得分Pts() != null
						&& castOther.get得分Pts() != null && this.get得分Pts().equals(castOther.get得分Pts())))
				&& ((this.get篮板Reb() == castOther.get篮板Reb()) || (this.get篮板Reb() != null
						&& castOther.get篮板Reb() != null && this.get篮板Reb().equals(castOther.get篮板Reb())))
				&& ((this.get进攻篮板Oreb() == castOther.get进攻篮板Oreb()) || (this.get进攻篮板Oreb() != null
						&& castOther.get进攻篮板Oreb() != null && this.get进攻篮板Oreb().equals(castOther.get进攻篮板Oreb())))
				&& ((this.get防守篮板Dreb() == castOther.get防守篮板Dreb()) || (this.get防守篮板Dreb() != null
						&& castOther.get防守篮板Dreb() != null && this.get防守篮板Dreb().equals(castOther.get防守篮板Dreb())))
				&& ((this.get出场时间Min() == castOther.get出场时间Min()) || (this.get出场时间Min() != null
						&& castOther.get出场时间Min() != null && this.get出场时间Min().equals(castOther.get出场时间Min())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (get排名Rank() == null ? 0 : this.get排名Rank().hashCode());
		result = 37 * result + (get球员PAyer() == null ? 0 : this.get球员PAyer().hashCode());
		result = 37 * result + (get号码No() == null ? 0 : this.get号码No().hashCode());
		result = 37 * result + (get球队Team() == null ? 0 : this.get球队Team().hashCode());
		result = 37 * result + (get场次Gp() == null ? 0 : this.get场次Gp().hashCode());
		result = 37 * result + (get首发Gs() == null ? 0 : this.get首发Gs().hashCode());
		result = 37 * result + (get得分Pts() == null ? 0 : this.get得分Pts().hashCode());
		result = 37 * result + (get篮板Reb() == null ? 0 : this.get篮板Reb().hashCode());
		result = 37 * result + (get进攻篮板Oreb() == null ? 0 : this.get进攻篮板Oreb().hashCode());
		result = 37 * result + (get防守篮板Dreb() == null ? 0 : this.get防守篮板Dreb().hashCode());
		result = 37 * result + (get出场时间Min() == null ? 0 : this.get出场时间Min().hashCode());
		return result;
	}

}