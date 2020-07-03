package com.hibernate;

/**
 * Sheet3Id entity. @author MyEclipse Persistence Tools
 */

public class Sheet3Id implements java.io.Serializable {

	// Fields

	private String 排名;
	private String 球队;
	private String 场数;
	private String 得分;
	private String 两分出手命中;
	private String 两分命中率;
	private String 三分出手命中;
	private String 三分命中率;
	private String 罚球出手命中;
	private String 罚球率;

	// Constructors

	/** default constructor */
	public Sheet3Id() {
	}

	/** full constructor */
	public Sheet3Id(String 排名, String 球队, String 场数, String 得分, String 两分出手命中, String 两分命中率, String 三分出手命中,
			String 三分命中率, String 罚球出手命中, String 罚球率) {
		this.排名 = 排名;
		this.球队 = 球队;
		this.场数 = 场数;
		this.得分 = 得分;
		this.两分出手命中 = 两分出手命中;
		this.两分命中率 = 两分命中率;
		this.三分出手命中 = 三分出手命中;
		this.三分命中率 = 三分命中率;
		this.罚球出手命中 = 罚球出手命中;
		this.罚球率 = 罚球率;
	}

	// Property accessors

	public String get排名() {
		return this.排名;
	}

	public void set排名(String 排名) {
		this.排名 = 排名;
	}

	public String get球队() {
		return this.球队;
	}

	public void set球队(String 球队) {
		this.球队 = 球队;
	}

	public String get场数() {
		return this.场数;
	}

	public void set场数(String 场数) {
		this.场数 = 场数;
	}

	public String get得分() {
		return this.得分;
	}

	public void set得分(String 得分) {
		this.得分 = 得分;
	}

	public String get两分出手命中() {
		return this.两分出手命中;
	}

	public void set两分出手命中(String 两分出手命中) {
		this.两分出手命中 = 两分出手命中;
	}

	public String get两分命中率() {
		return this.两分命中率;
	}

	public void set两分命中率(String 两分命中率) {
		this.两分命中率 = 两分命中率;
	}

	public String get三分出手命中() {
		return this.三分出手命中;
	}

	public void set三分出手命中(String 三分出手命中) {
		this.三分出手命中 = 三分出手命中;
	}

	public String get三分命中率() {
		return this.三分命中率;
	}

	public void set三分命中率(String 三分命中率) {
		this.三分命中率 = 三分命中率;
	}

	public String get罚球出手命中() {
		return this.罚球出手命中;
	}

	public void set罚球出手命中(String 罚球出手命中) {
		this.罚球出手命中 = 罚球出手命中;
	}

	public String get罚球率() {
		return this.罚球率;
	}

	public void set罚球率(String 罚球率) {
		this.罚球率 = 罚球率;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Sheet3Id))
			return false;
		Sheet3Id castOther = (Sheet3Id) other;

		return ((this.get排名() == castOther.get排名())
				|| (this.get排名() != null && castOther.get排名() != null && this.get排名().equals(castOther.get排名())))
				&& ((this.get球队() == castOther.get球队()) || (this.get球队() != null && castOther.get球队() != null
						&& this.get球队().equals(castOther.get球队())))
				&& ((this.get场数() == castOther.get场数()) || (this.get场数() != null && castOther.get场数() != null
						&& this.get场数().equals(castOther.get场数())))
				&& ((this.get得分() == castOther.get得分()) || (this.get得分() != null && castOther.get得分() != null
						&& this.get得分().equals(castOther.get得分())))
				&& ((this.get两分出手命中() == castOther.get两分出手命中()) || (this.get两分出手命中() != null
						&& castOther.get两分出手命中() != null && this.get两分出手命中().equals(castOther.get两分出手命中())))
				&& ((this.get两分命中率() == castOther.get两分命中率()) || (this.get两分命中率() != null
						&& castOther.get两分命中率() != null && this.get两分命中率().equals(castOther.get两分命中率())))
				&& ((this.get三分出手命中() == castOther.get三分出手命中()) || (this.get三分出手命中() != null
						&& castOther.get三分出手命中() != null && this.get三分出手命中().equals(castOther.get三分出手命中())))
				&& ((this.get三分命中率() == castOther.get三分命中率()) || (this.get三分命中率() != null
						&& castOther.get三分命中率() != null && this.get三分命中率().equals(castOther.get三分命中率())))
				&& ((this.get罚球出手命中() == castOther.get罚球出手命中()) || (this.get罚球出手命中() != null
						&& castOther.get罚球出手命中() != null && this.get罚球出手命中().equals(castOther.get罚球出手命中())))
				&& ((this.get罚球率() == castOther.get罚球率()) || (this.get罚球率() != null && castOther.get罚球率() != null
						&& this.get罚球率().equals(castOther.get罚球率())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (get排名() == null ? 0 : this.get排名().hashCode());
		result = 37 * result + (get球队() == null ? 0 : this.get球队().hashCode());
		result = 37 * result + (get场数() == null ? 0 : this.get场数().hashCode());
		result = 37 * result + (get得分() == null ? 0 : this.get得分().hashCode());
		result = 37 * result + (get两分出手命中() == null ? 0 : this.get两分出手命中().hashCode());
		result = 37 * result + (get两分命中率() == null ? 0 : this.get两分命中率().hashCode());
		result = 37 * result + (get三分出手命中() == null ? 0 : this.get三分出手命中().hashCode());
		result = 37 * result + (get三分命中率() == null ? 0 : this.get三分命中率().hashCode());
		result = 37 * result + (get罚球出手命中() == null ? 0 : this.get罚球出手命中().hashCode());
		result = 37 * result + (get罚球率() == null ? 0 : this.get罚球率().hashCode());
		return result;
	}

}