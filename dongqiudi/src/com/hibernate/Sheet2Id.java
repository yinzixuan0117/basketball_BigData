package com.hibernate;

/**
 * Sheet2Id entity. @author MyEclipse Persistence Tools
 */

public class Sheet2Id implements java.io.Serializable {

	// Fields

	private String 排名;
	private String 球队;
	private String 场数;
	private String 得分;
	private String 篮板;
	private String 进攻篮板;
	private String 防守篮板;

	// Constructors

	/** default constructor */
	public Sheet2Id() {
	}

	/** full constructor */
	public Sheet2Id(String 排名, String 球队, String 场数, String 得分, String 篮板, String 进攻篮板, String 防守篮板) {
		this.排名 = 排名;
		this.球队 = 球队;
		this.场数 = 场数;
		this.得分 = 得分;
		this.篮板 = 篮板;
		this.进攻篮板 = 进攻篮板;
		this.防守篮板 = 防守篮板;
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

	public String get篮板() {
		return this.篮板;
	}

	public void set篮板(String 篮板) {
		this.篮板 = 篮板;
	}

	public String get进攻篮板() {
		return this.进攻篮板;
	}

	public void set进攻篮板(String 进攻篮板) {
		this.进攻篮板 = 进攻篮板;
	}

	public String get防守篮板() {
		return this.防守篮板;
	}

	public void set防守篮板(String 防守篮板) {
		this.防守篮板 = 防守篮板;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Sheet2Id))
			return false;
		Sheet2Id castOther = (Sheet2Id) other;

		return ((this.get排名() == castOther.get排名())
				|| (this.get排名() != null && castOther.get排名() != null && this.get排名().equals(castOther.get排名())))
				&& ((this.get球队() == castOther.get球队()) || (this.get球队() != null && castOther.get球队() != null
						&& this.get球队().equals(castOther.get球队())))
				&& ((this.get场数() == castOther.get场数()) || (this.get场数() != null && castOther.get场数() != null
						&& this.get场数().equals(castOther.get场数())))
				&& ((this.get得分() == castOther.get得分()) || (this.get得分() != null && castOther.get得分() != null
						&& this.get得分().equals(castOther.get得分())))
				&& ((this.get篮板() == castOther.get篮板()) || (this.get篮板() != null && castOther.get篮板() != null
						&& this.get篮板().equals(castOther.get篮板())))
				&& ((this.get进攻篮板() == castOther.get进攻篮板()) || (this.get进攻篮板() != null && castOther.get进攻篮板() != null
						&& this.get进攻篮板().equals(castOther.get进攻篮板())))
				&& ((this.get防守篮板() == castOther.get防守篮板()) || (this.get防守篮板() != null && castOther.get防守篮板() != null
						&& this.get防守篮板().equals(castOther.get防守篮板())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (get排名() == null ? 0 : this.get排名().hashCode());
		result = 37 * result + (get球队() == null ? 0 : this.get球队().hashCode());
		result = 37 * result + (get场数() == null ? 0 : this.get场数().hashCode());
		result = 37 * result + (get得分() == null ? 0 : this.get得分().hashCode());
		result = 37 * result + (get篮板() == null ? 0 : this.get篮板().hashCode());
		result = 37 * result + (get进攻篮板() == null ? 0 : this.get进攻篮板().hashCode());
		result = 37 * result + (get防守篮板() == null ? 0 : this.get防守篮板().hashCode());
		return result;
	}

}