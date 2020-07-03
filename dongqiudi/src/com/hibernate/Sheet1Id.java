package com.hibernate;

/**
 * Sheet1Id entity. @author MyEclipse Persistence Tools
 */

public class Sheet1Id implements java.io.Serializable {

	// Fields

	private String 排名;
	private String 球队;
	private String 总场次;
	private String 胜场;
	private String 负场;
	private String 主场战绩;
	private String 客场战绩;
	private String 场均得分;
	private String 场均失分;

	// Constructors

	/** default constructor */
	public Sheet1Id() {
	}

	/** full constructor */
	public Sheet1Id(String 排名, String 球队, String 总场次, String 胜场, String 负场, String 主场战绩, String 客场战绩, String 场均得分,
			String 场均失分) {
		this.排名 = 排名;
		this.球队 = 球队;
		this.总场次 = 总场次;
		this.胜场 = 胜场;
		this.负场 = 负场;
		this.主场战绩 = 主场战绩;
		this.客场战绩 = 客场战绩;
		this.场均得分 = 场均得分;
		this.场均失分 = 场均失分;
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

	public String get总场次() {
		return this.总场次;
	}

	public void set总场次(String 总场次) {
		this.总场次 = 总场次;
	}

	public String get胜场() {
		return this.胜场;
	}

	public void set胜场(String 胜场) {
		this.胜场 = 胜场;
	}

	public String get负场() {
		return this.负场;
	}

	public void set负场(String 负场) {
		this.负场 = 负场;
	}

	public String get主场战绩() {
		return this.主场战绩;
	}

	public void set主场战绩(String 主场战绩) {
		this.主场战绩 = 主场战绩;
	}

	public String get客场战绩() {
		return this.客场战绩;
	}

	public void set客场战绩(String 客场战绩) {
		this.客场战绩 = 客场战绩;
	}

	public String get场均得分() {
		return this.场均得分;
	}

	public void set场均得分(String 场均得分) {
		this.场均得分 = 场均得分;
	}

	public String get场均失分() {
		return this.场均失分;
	}

	public void set场均失分(String 场均失分) {
		this.场均失分 = 场均失分;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Sheet1Id))
			return false;
		Sheet1Id castOther = (Sheet1Id) other;

		return ((this.get排名() == castOther.get排名())
				|| (this.get排名() != null && castOther.get排名() != null && this.get排名().equals(castOther.get排名())))
				&& ((this.get球队() == castOther.get球队()) || (this.get球队() != null && castOther.get球队() != null
						&& this.get球队().equals(castOther.get球队())))
				&& ((this.get总场次() == castOther.get总场次()) || (this.get总场次() != null && castOther.get总场次() != null
						&& this.get总场次().equals(castOther.get总场次())))
				&& ((this.get胜场() == castOther.get胜场()) || (this.get胜场() != null && castOther.get胜场() != null
						&& this.get胜场().equals(castOther.get胜场())))
				&& ((this.get负场() == castOther.get负场()) || (this.get负场() != null && castOther.get负场() != null
						&& this.get负场().equals(castOther.get负场())))
				&& ((this.get主场战绩() == castOther.get主场战绩()) || (this.get主场战绩() != null && castOther.get主场战绩() != null
						&& this.get主场战绩().equals(castOther.get主场战绩())))
				&& ((this.get客场战绩() == castOther.get客场战绩()) || (this.get客场战绩() != null && castOther.get客场战绩() != null
						&& this.get客场战绩().equals(castOther.get客场战绩())))
				&& ((this.get场均得分() == castOther.get场均得分()) || (this.get场均得分() != null && castOther.get场均得分() != null
						&& this.get场均得分().equals(castOther.get场均得分())))
				&& ((this.get场均失分() == castOther.get场均失分()) || (this.get场均失分() != null && castOther.get场均失分() != null
						&& this.get场均失分().equals(castOther.get场均失分())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (get排名() == null ? 0 : this.get排名().hashCode());
		result = 37 * result + (get球队() == null ? 0 : this.get球队().hashCode());
		result = 37 * result + (get总场次() == null ? 0 : this.get总场次().hashCode());
		result = 37 * result + (get胜场() == null ? 0 : this.get胜场().hashCode());
		result = 37 * result + (get负场() == null ? 0 : this.get负场().hashCode());
		result = 37 * result + (get主场战绩() == null ? 0 : this.get主场战绩().hashCode());
		result = 37 * result + (get客场战绩() == null ? 0 : this.get客场战绩().hashCode());
		result = 37 * result + (get场均得分() == null ? 0 : this.get场均得分().hashCode());
		result = 37 * result + (get场均失分() == null ? 0 : this.get场均失分().hashCode());
		return result;
	}

}