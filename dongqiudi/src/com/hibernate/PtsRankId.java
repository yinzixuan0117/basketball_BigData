package com.hibernate;

/**
 * PtsRankId entity. @author MyEclipse Persistence Tools
 */

public class PtsRankId implements java.io.Serializable {

	// Fields

	private String 排名;
	private String 球员;
	private String 号码;
	private String 球队;
	private String 场次;
	private String 首发;
	private String 得分;
	private String 位置;
	private String 两分出手命中;
	private String 两分命中率;
	private String 三分出手命中;
	private String 三分命中率;
	private String 罚球出手命中;
	private String 罚球命中率;
	private String 出场时间;

	// Constructors

	/** default constructor */
	public PtsRankId() {
	}

	/** full constructor */
	public PtsRankId(String 排名, String 球员, String 号码, String 球队, String 场次, String 首发, String 得分, String 位置,
			String 两分出手命中, String 两分命中率, String 三分出手命中, String 三分命中率, String 罚球出手命中, String 罚球命中率, String 出场时间) {
		this.排名 = 排名;
		this.球员 = 球员;
		this.号码 = 号码;
		this.球队 = 球队;
		this.场次 = 场次;
		this.首发 = 首发;
		this.得分 = 得分;
		this.位置 = 位置;
		this.两分出手命中 = 两分出手命中;
		this.两分命中率 = 两分命中率;
		this.三分出手命中 = 三分出手命中;
		this.三分命中率 = 三分命中率;
		this.罚球出手命中 = 罚球出手命中;
		this.罚球命中率 = 罚球命中率;
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

	public String get位置() {
		return this.位置;
	}

	public void set位置(String 位置) {
		this.位置 = 位置;
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

	public String get罚球命中率() {
		return this.罚球命中率;
	}

	public void set罚球命中率(String 罚球命中率) {
		this.罚球命中率 = 罚球命中率;
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
		if (!(other instanceof PtsRankId))
			return false;
		PtsRankId castOther = (PtsRankId) other;

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
				&& ((this.get位置() == castOther.get位置()) || (this.get位置() != null && castOther.get位置() != null
						&& this.get位置().equals(castOther.get位置())))
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
				&& ((this.get罚球命中率() == castOther.get罚球命中率()) || (this.get罚球命中率() != null
						&& castOther.get罚球命中率() != null && this.get罚球命中率().equals(castOther.get罚球命中率())))
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
		result = 37 * result + (get位置() == null ? 0 : this.get位置().hashCode());
		result = 37 * result + (get两分出手命中() == null ? 0 : this.get两分出手命中().hashCode());
		result = 37 * result + (get两分命中率() == null ? 0 : this.get两分命中率().hashCode());
		result = 37 * result + (get三分出手命中() == null ? 0 : this.get三分出手命中().hashCode());
		result = 37 * result + (get三分命中率() == null ? 0 : this.get三分命中率().hashCode());
		result = 37 * result + (get罚球出手命中() == null ? 0 : this.get罚球出手命中().hashCode());
		result = 37 * result + (get罚球命中率() == null ? 0 : this.get罚球命中率().hashCode());
		result = 37 * result + (get出场时间() == null ? 0 : this.get出场时间().hashCode());
		return result;
	}

}