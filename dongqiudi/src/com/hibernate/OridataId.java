package com.hibernate;

/**
 * OridataId entity. @author MyEclipse Persistence Tools
 */

public class OridataId implements java.io.Serializable {

	// Fields

	private String 姓名;
	private String 位置;
	private String 号码;
	private String country;
	private Integer 身高;
	private Integer 体重;
	private String 球队;
	private String 出场;
	private String 首发;
	private Integer 时间;
	private Float 两分命中率;
	private String 命中;
	private Float 三分命中率;
	private String 三分;
	private Float 罚球命中率;
	private String 罚球;
	private Float 进攻篮板;
	private Float 防守篮板;
	private Float 总篮板;
	private Float 助攻;
	private Float 抢断;
	private Float 盖帽;
	private Float 失误;
	private Float 犯规;
	private Float 场均分;

	// Constructors

	/** default constructor */
	public OridataId() {
	}

	/** full constructor */
	public OridataId(String 姓名, String 位置, String 号码, String country, Integer 身高, Integer 体重, String 球队, String 出场,
			String 首发, Integer 时间, Float 两分命中率, String 命中, Float 三分命中率, String 三分, Float 罚球命中率, String 罚球, Float 进攻篮板,
			Float 防守篮板, Float 总篮板, Float 助攻, Float 抢断, Float 盖帽, Float 失误, Float 犯规, Float 场均分) {
		this.姓名 = 姓名;
		this.位置 = 位置;
		this.号码 = 号码;
		this.country = country;
		this.身高 = 身高;
		this.体重 = 体重;
		this.球队 = 球队;
		this.出场 = 出场;
		this.首发 = 首发;
		this.时间 = 时间;
		this.两分命中率 = 两分命中率;
		this.命中 = 命中;
		this.三分命中率 = 三分命中率;
		this.三分 = 三分;
		this.罚球命中率 = 罚球命中率;
		this.罚球 = 罚球;
		this.进攻篮板 = 进攻篮板;
		this.防守篮板 = 防守篮板;
		this.总篮板 = 总篮板;
		this.助攻 = 助攻;
		this.抢断 = 抢断;
		this.盖帽 = 盖帽;
		this.失误 = 失误;
		this.犯规 = 犯规;
		this.场均分 = 场均分;
	}

	// Property accessors

	public String get姓名() {
		return this.姓名;
	}

	public void set姓名(String 姓名) {
		this.姓名 = 姓名;
	}

	public String get位置() {
		return this.位置;
	}

	public void set位置(String 位置) {
		this.位置 = 位置;
	}

	public String get号码() {
		return this.号码;
	}

	public void set号码(String 号码) {
		this.号码 = 号码;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer get身高() {
		return this.身高;
	}

	public void set身高(Integer 身高) {
		this.身高 = 身高;
	}

	public Integer get体重() {
		return this.体重;
	}

	public void set体重(Integer 体重) {
		this.体重 = 体重;
	}

	public String get球队() {
		return this.球队;
	}

	public void set球队(String 球队) {
		this.球队 = 球队;
	}

	public String get出场() {
		return this.出场;
	}

	public void set出场(String 出场) {
		this.出场 = 出场;
	}

	public String get首发() {
		return this.首发;
	}

	public void set首发(String 首发) {
		this.首发 = 首发;
	}

	public Integer get时间() {
		return this.时间;
	}

	public void set时间(Integer 时间) {
		this.时间 = 时间;
	}

	public Float get两分命中率() {
		return this.两分命中率;
	}

	public void set两分命中率(Float 两分命中率) {
		this.两分命中率 = 两分命中率;
	}

	public String get命中() {
		return this.命中;
	}

	public void set命中(String 命中) {
		this.命中 = 命中;
	}

	public Float get三分命中率() {
		return this.三分命中率;
	}

	public void set三分命中率(Float 三分命中率) {
		this.三分命中率 = 三分命中率;
	}

	public String get三分() {
		return this.三分;
	}

	public void set三分(String 三分) {
		this.三分 = 三分;
	}

	public Float get罚球命中率() {
		return this.罚球命中率;
	}

	public void set罚球命中率(Float 罚球命中率) {
		this.罚球命中率 = 罚球命中率;
	}

	public String get罚球() {
		return this.罚球;
	}

	public void set罚球(String 罚球) {
		this.罚球 = 罚球;
	}

	public Float get进攻篮板() {
		return this.进攻篮板;
	}

	public void set进攻篮板(Float 进攻篮板) {
		this.进攻篮板 = 进攻篮板;
	}

	public Float get防守篮板() {
		return this.防守篮板;
	}

	public void set防守篮板(Float 防守篮板) {
		this.防守篮板 = 防守篮板;
	}

	public Float get总篮板() {
		return this.总篮板;
	}

	public void set总篮板(Float 总篮板) {
		this.总篮板 = 总篮板;
	}

	public Float get助攻() {
		return this.助攻;
	}

	public void set助攻(Float 助攻) {
		this.助攻 = 助攻;
	}

	public Float get抢断() {
		return this.抢断;
	}

	public void set抢断(Float 抢断) {
		this.抢断 = 抢断;
	}

	public Float get盖帽() {
		return this.盖帽;
	}

	public void set盖帽(Float 盖帽) {
		this.盖帽 = 盖帽;
	}

	public Float get失误() {
		return this.失误;
	}

	public void set失误(Float 失误) {
		this.失误 = 失误;
	}

	public Float get犯规() {
		return this.犯规;
	}

	public void set犯规(Float 犯规) {
		this.犯规 = 犯规;
	}

	public Float get场均分() {
		return this.场均分;
	}

	public void set场均分(Float 场均分) {
		this.场均分 = 场均分;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof OridataId))
			return false;
		OridataId castOther = (OridataId) other;

		return ((this.get姓名() == castOther.get姓名())
				|| (this.get姓名() != null && castOther.get姓名() != null && this.get姓名().equals(castOther.get姓名())))
				&& ((this.get位置() == castOther.get位置()) || (this.get位置() != null && castOther.get位置() != null
						&& this.get位置().equals(castOther.get位置())))
				&& ((this.get号码() == castOther.get号码()) || (this.get号码() != null && castOther.get号码() != null
						&& this.get号码().equals(castOther.get号码())))
				&& ((this.getCountry() == castOther.getCountry()) || (this.getCountry() != null
						&& castOther.getCountry() != null && this.getCountry().equals(castOther.getCountry())))
				&& ((this.get身高() == castOther.get身高()) || (this.get身高() != null && castOther.get身高() != null
						&& this.get身高().equals(castOther.get身高())))
				&& ((this.get体重() == castOther.get体重()) || (this.get体重() != null && castOther.get体重() != null
						&& this.get体重().equals(castOther.get体重())))
				&& ((this.get球队() == castOther.get球队()) || (this.get球队() != null && castOther.get球队() != null
						&& this.get球队().equals(castOther.get球队())))
				&& ((this.get出场() == castOther.get出场()) || (this.get出场() != null && castOther.get出场() != null
						&& this.get出场().equals(castOther.get出场())))
				&& ((this.get首发() == castOther.get首发()) || (this.get首发() != null && castOther.get首发() != null
						&& this.get首发().equals(castOther.get首发())))
				&& ((this.get时间() == castOther.get时间()) || (this.get时间() != null && castOther.get时间() != null
						&& this.get时间().equals(castOther.get时间())))
				&& ((this.get两分命中率() == castOther.get两分命中率()) || (this.get两分命中率() != null
						&& castOther.get两分命中率() != null && this.get两分命中率().equals(castOther.get两分命中率())))
				&& ((this.get命中() == castOther.get命中()) || (this.get命中() != null && castOther.get命中() != null
						&& this.get命中().equals(castOther.get命中())))
				&& ((this.get三分命中率() == castOther.get三分命中率()) || (this.get三分命中率() != null
						&& castOther.get三分命中率() != null && this.get三分命中率().equals(castOther.get三分命中率())))
				&& ((this.get三分() == castOther.get三分()) || (this.get三分() != null && castOther.get三分() != null
						&& this.get三分().equals(castOther.get三分())))
				&& ((this.get罚球命中率() == castOther.get罚球命中率()) || (this.get罚球命中率() != null
						&& castOther.get罚球命中率() != null && this.get罚球命中率().equals(castOther.get罚球命中率())))
				&& ((this.get罚球() == castOther.get罚球()) || (this.get罚球() != null && castOther.get罚球() != null
						&& this.get罚球().equals(castOther.get罚球())))
				&& ((this.get进攻篮板() == castOther.get进攻篮板()) || (this.get进攻篮板() != null && castOther.get进攻篮板() != null
						&& this.get进攻篮板().equals(castOther.get进攻篮板())))
				&& ((this.get防守篮板() == castOther.get防守篮板()) || (this.get防守篮板() != null && castOther.get防守篮板() != null
						&& this.get防守篮板().equals(castOther.get防守篮板())))
				&& ((this.get总篮板() == castOther.get总篮板()) || (this.get总篮板() != null && castOther.get总篮板() != null
						&& this.get总篮板().equals(castOther.get总篮板())))
				&& ((this.get助攻() == castOther.get助攻()) || (this.get助攻() != null && castOther.get助攻() != null
						&& this.get助攻().equals(castOther.get助攻())))
				&& ((this.get抢断() == castOther.get抢断()) || (this.get抢断() != null && castOther.get抢断() != null
						&& this.get抢断().equals(castOther.get抢断())))
				&& ((this.get盖帽() == castOther.get盖帽()) || (this.get盖帽() != null && castOther.get盖帽() != null
						&& this.get盖帽().equals(castOther.get盖帽())))
				&& ((this.get失误() == castOther.get失误()) || (this.get失误() != null && castOther.get失误() != null
						&& this.get失误().equals(castOther.get失误())))
				&& ((this.get犯规() == castOther.get犯规()) || (this.get犯规() != null && castOther.get犯规() != null
						&& this.get犯规().equals(castOther.get犯规())))
				&& ((this.get场均分() == castOther.get场均分()) || (this.get场均分() != null && castOther.get场均分() != null
						&& this.get场均分().equals(castOther.get场均分())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (get姓名() == null ? 0 : this.get姓名().hashCode());
		result = 37 * result + (get位置() == null ? 0 : this.get位置().hashCode());
		result = 37 * result + (get号码() == null ? 0 : this.get号码().hashCode());
		result = 37 * result + (getCountry() == null ? 0 : this.getCountry().hashCode());
		result = 37 * result + (get身高() == null ? 0 : this.get身高().hashCode());
		result = 37 * result + (get体重() == null ? 0 : this.get体重().hashCode());
		result = 37 * result + (get球队() == null ? 0 : this.get球队().hashCode());
		result = 37 * result + (get出场() == null ? 0 : this.get出场().hashCode());
		result = 37 * result + (get首发() == null ? 0 : this.get首发().hashCode());
		result = 37 * result + (get时间() == null ? 0 : this.get时间().hashCode());
		result = 37 * result + (get两分命中率() == null ? 0 : this.get两分命中率().hashCode());
		result = 37 * result + (get命中() == null ? 0 : this.get命中().hashCode());
		result = 37 * result + (get三分命中率() == null ? 0 : this.get三分命中率().hashCode());
		result = 37 * result + (get三分() == null ? 0 : this.get三分().hashCode());
		result = 37 * result + (get罚球命中率() == null ? 0 : this.get罚球命中率().hashCode());
		result = 37 * result + (get罚球() == null ? 0 : this.get罚球().hashCode());
		result = 37 * result + (get进攻篮板() == null ? 0 : this.get进攻篮板().hashCode());
		result = 37 * result + (get防守篮板() == null ? 0 : this.get防守篮板().hashCode());
		result = 37 * result + (get总篮板() == null ? 0 : this.get总篮板().hashCode());
		result = 37 * result + (get助攻() == null ? 0 : this.get助攻().hashCode());
		result = 37 * result + (get抢断() == null ? 0 : this.get抢断().hashCode());
		result = 37 * result + (get盖帽() == null ? 0 : this.get盖帽().hashCode());
		result = 37 * result + (get失误() == null ? 0 : this.get失误().hashCode());
		result = 37 * result + (get犯规() == null ? 0 : this.get犯规().hashCode());
		result = 37 * result + (get场均分() == null ? 0 : this.get场均分().hashCode());
		return result;
	}

}