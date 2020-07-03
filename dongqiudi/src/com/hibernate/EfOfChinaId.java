package com.hibernate;

/**
 * EfOfChinaId entity. @author MyEclipse Persistence Tools
 */

public class EfOfChinaId implements java.io.Serializable {

	// Fields

	private String 排名;
	private String 球员;
	private String 号码;
	private String 球队;
	private String 场次;
	private String 首发;
	private String 得分;
	private String 效率值;
	private Integer 进攻效率;
	private Integer 防守效率;
	private String 助攻失误比;
	private String 获胜贡献值;
	private String 进攻防守贡献;
	private String 使用率;
	private String 正负值;
	private String 出场时间;

	// Constructors

	/** default constructor */
	public EfOfChinaId() {
	}

	/** full constructor */
	public EfOfChinaId(String 排名, String 球员, String 号码, String 球队, String 场次, String 首发, String 得分, String 效率值,
			Integer 进攻效率, Integer 防守效率, String 助攻失误比, String 获胜贡献值, String 进攻防守贡献, String 使用率, String 正负值,
			String 出场时间) {
		this.排名 = 排名;
		this.球员 = 球员;
		this.号码 = 号码;
		this.球队 = 球队;
		this.场次 = 场次;
		this.首发 = 首发;
		this.得分 = 得分;
		this.效率值 = 效率值;
		this.进攻效率 = 进攻效率;
		this.防守效率 = 防守效率;
		this.助攻失误比 = 助攻失误比;
		this.获胜贡献值 = 获胜贡献值;
		this.进攻防守贡献 = 进攻防守贡献;
		this.使用率 = 使用率;
		this.正负值 = 正负值;
		this.出场时间 = 出场时间;
	}

	// Property accessors

	public String get排名() {
		return this.排名;
	}

	public void set排名(String 排名) {
		this.排名 = 排名;
	}

	public String get球员() {
		return this.球员;
	}

	public void set球员(String 球员) {
		this.球员 = 球员;
	}

	public String get号码() {
		return this.号码;
	}

	public void set号码(String 号码) {
		this.号码 = 号码;
	}

	public String get球队() {
		return this.球队;
	}

	public void set球队(String 球队) {
		this.球队 = 球队;
	}

	public String get场次() {
		return this.场次;
	}

	public void set场次(String 场次) {
		this.场次 = 场次;
	}

	public String get首发() {
		return this.首发;
	}

	public void set首发(String 首发) {
		this.首发 = 首发;
	}

	public String get得分() {
		return this.得分;
	}

	public void set得分(String 得分) {
		this.得分 = 得分;
	}

	public String get效率值() {
		return this.效率值;
	}

	public void set效率值(String 效率值) {
		this.效率值 = 效率值;
	}

	public Integer get进攻效率() {
		return this.进攻效率;
	}

	public void set进攻效率(Integer 进攻效率) {
		this.进攻效率 = 进攻效率;
	}

	public Integer get防守效率() {
		return this.防守效率;
	}

	public void set防守效率(Integer 防守效率) {
		this.防守效率 = 防守效率;
	}

	public String get助攻失误比() {
		return this.助攻失误比;
	}

	public void set助攻失误比(String 助攻失误比) {
		this.助攻失误比 = 助攻失误比;
	}

	public String get获胜贡献值() {
		return this.获胜贡献值;
	}

	public void set获胜贡献值(String 获胜贡献值) {
		this.获胜贡献值 = 获胜贡献值;
	}

	public String get进攻防守贡献() {
		return this.进攻防守贡献;
	}

	public void set进攻防守贡献(String 进攻防守贡献) {
		this.进攻防守贡献 = 进攻防守贡献;
	}

	public String get使用率() {
		return this.使用率;
	}

	public void set使用率(String 使用率) {
		this.使用率 = 使用率;
	}

	public String get正负值() {
		return this.正负值;
	}

	public void set正负值(String 正负值) {
		this.正负值 = 正负值;
	}

	public String get出场时间() {
		return this.出场时间;
	}

	public void set出场时间(String 出场时间) {
		this.出场时间 = 出场时间;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EfOfChinaId))
			return false;
		EfOfChinaId castOther = (EfOfChinaId) other;

		return ((this.get排名() == castOther.get排名())
				|| (this.get排名() != null && castOther.get排名() != null && this.get排名().equals(castOther.get排名())))
				&& ((this.get球员() == castOther.get球员()) || (this.get球员() != null && castOther.get球员() != null
						&& this.get球员().equals(castOther.get球员())))
				&& ((this.get号码() == castOther.get号码()) || (this.get号码() != null && castOther.get号码() != null
						&& this.get号码().equals(castOther.get号码())))
				&& ((this.get球队() == castOther.get球队()) || (this.get球队() != null && castOther.get球队() != null
						&& this.get球队().equals(castOther.get球队())))
				&& ((this.get场次() == castOther.get场次()) || (this.get场次() != null && castOther.get场次() != null
						&& this.get场次().equals(castOther.get场次())))
				&& ((this.get首发() == castOther.get首发()) || (this.get首发() != null && castOther.get首发() != null
						&& this.get首发().equals(castOther.get首发())))
				&& ((this.get得分() == castOther.get得分()) || (this.get得分() != null && castOther.get得分() != null
						&& this.get得分().equals(castOther.get得分())))
				&& ((this.get效率值() == castOther.get效率值()) || (this.get效率值() != null && castOther.get效率值() != null
						&& this.get效率值().equals(castOther.get效率值())))
				&& ((this.get进攻效率() == castOther.get进攻效率()) || (this.get进攻效率() != null && castOther.get进攻效率() != null
						&& this.get进攻效率().equals(castOther.get进攻效率())))
				&& ((this.get防守效率() == castOther.get防守效率()) || (this.get防守效率() != null && castOther.get防守效率() != null
						&& this.get防守效率().equals(castOther.get防守效率())))
				&& ((this.get助攻失误比() == castOther.get助攻失误比()) || (this.get助攻失误比() != null
						&& castOther.get助攻失误比() != null && this.get助攻失误比().equals(castOther.get助攻失误比())))
				&& ((this.get获胜贡献值() == castOther.get获胜贡献值()) || (this.get获胜贡献值() != null
						&& castOther.get获胜贡献值() != null && this.get获胜贡献值().equals(castOther.get获胜贡献值())))
				&& ((this.get进攻防守贡献() == castOther.get进攻防守贡献()) || (this.get进攻防守贡献() != null
						&& castOther.get进攻防守贡献() != null && this.get进攻防守贡献().equals(castOther.get进攻防守贡献())))
				&& ((this.get使用率() == castOther.get使用率()) || (this.get使用率() != null && castOther.get使用率() != null
						&& this.get使用率().equals(castOther.get使用率())))
				&& ((this.get正负值() == castOther.get正负值()) || (this.get正负值() != null && castOther.get正负值() != null
						&& this.get正负值().equals(castOther.get正负值())))
				&& ((this.get出场时间() == castOther.get出场时间()) || (this.get出场时间() != null && castOther.get出场时间() != null
						&& this.get出场时间().equals(castOther.get出场时间())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (get排名() == null ? 0 : this.get排名().hashCode());
		result = 37 * result + (get球员() == null ? 0 : this.get球员().hashCode());
		result = 37 * result + (get号码() == null ? 0 : this.get号码().hashCode());
		result = 37 * result + (get球队() == null ? 0 : this.get球队().hashCode());
		result = 37 * result + (get场次() == null ? 0 : this.get场次().hashCode());
		result = 37 * result + (get首发() == null ? 0 : this.get首发().hashCode());
		result = 37 * result + (get得分() == null ? 0 : this.get得分().hashCode());
		result = 37 * result + (get效率值() == null ? 0 : this.get效率值().hashCode());
		result = 37 * result + (get进攻效率() == null ? 0 : this.get进攻效率().hashCode());
		result = 37 * result + (get防守效率() == null ? 0 : this.get防守效率().hashCode());
		result = 37 * result + (get助攻失误比() == null ? 0 : this.get助攻失误比().hashCode());
		result = 37 * result + (get获胜贡献值() == null ? 0 : this.get获胜贡献值().hashCode());
		result = 37 * result + (get进攻防守贡献() == null ? 0 : this.get进攻防守贡献().hashCode());
		result = 37 * result + (get使用率() == null ? 0 : this.get使用率().hashCode());
		result = 37 * result + (get正负值() == null ? 0 : this.get正负值().hashCode());
		result = 37 * result + (get出场时间() == null ? 0 : this.get出场时间().hashCode());
		return result;
	}

}