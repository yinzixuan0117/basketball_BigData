package com.hibernate;

/**
 * OridataId entity. @author MyEclipse Persistence Tools
 */

public class OridataId implements java.io.Serializable {

	// Fields

	private String ����;
	private String λ��;
	private String ����;
	private String country;
	private Integer ���;
	private Integer ����;
	private String ���;
	private String ����;
	private String �׷�;
	private Integer ʱ��;
	private Float ����������;
	private String ����;
	private Float ����������;
	private String ����;
	private Float ����������;
	private String ����;
	private Float ��������;
	private Float ��������;
	private Float ������;
	private Float ����;
	private Float ����;
	private Float ��ñ;
	private Float ʧ��;
	private Float ����;
	private Float ������;

	// Constructors

	/** default constructor */
	public OridataId() {
	}

	/** full constructor */
	public OridataId(String ����, String λ��, String ����, String country, Integer ���, Integer ����, String ���, String ����,
			String �׷�, Integer ʱ��, Float ����������, String ����, Float ����������, String ����, Float ����������, String ����, Float ��������,
			Float ��������, Float ������, Float ����, Float ����, Float ��ñ, Float ʧ��, Float ����, Float ������) {
		this.���� = ����;
		this.λ�� = λ��;
		this.���� = ����;
		this.country = country;
		this.��� = ���;
		this.���� = ����;
		this.��� = ���;
		this.���� = ����;
		this.�׷� = �׷�;
		this.ʱ�� = ʱ��;
		this.���������� = ����������;
		this.���� = ����;
		this.���������� = ����������;
		this.���� = ����;
		this.���������� = ����������;
		this.���� = ����;
		this.�������� = ��������;
		this.�������� = ��������;
		this.������ = ������;
		this.���� = ����;
		this.���� = ����;
		this.��ñ = ��ñ;
		this.ʧ�� = ʧ��;
		this.���� = ����;
		this.������ = ������;
	}

	// Property accessors

	public String get����() {
		return this.����;
	}

	public void set����(String ����) {
		this.���� = ����;
	}

	public String getλ��() {
		return this.λ��;
	}

	public void setλ��(String λ��) {
		this.λ�� = λ��;
	}

	public String get����() {
		return this.����;
	}

	public void set����(String ����) {
		this.���� = ����;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer get���() {
		return this.���;
	}

	public void set���(Integer ���) {
		this.��� = ���;
	}

	public Integer get����() {
		return this.����;
	}

	public void set����(Integer ����) {
		this.���� = ����;
	}

	public String get���() {
		return this.���;
	}

	public void set���(String ���) {
		this.��� = ���;
	}

	public String get����() {
		return this.����;
	}

	public void set����(String ����) {
		this.���� = ����;
	}

	public String get�׷�() {
		return this.�׷�;
	}

	public void set�׷�(String �׷�) {
		this.�׷� = �׷�;
	}

	public Integer getʱ��() {
		return this.ʱ��;
	}

	public void setʱ��(Integer ʱ��) {
		this.ʱ�� = ʱ��;
	}

	public Float get����������() {
		return this.����������;
	}

	public void set����������(Float ����������) {
		this.���������� = ����������;
	}

	public String get����() {
		return this.����;
	}

	public void set����(String ����) {
		this.���� = ����;
	}

	public Float get����������() {
		return this.����������;
	}

	public void set����������(Float ����������) {
		this.���������� = ����������;
	}

	public String get����() {
		return this.����;
	}

	public void set����(String ����) {
		this.���� = ����;
	}

	public Float get����������() {
		return this.����������;
	}

	public void set����������(Float ����������) {
		this.���������� = ����������;
	}

	public String get����() {
		return this.����;
	}

	public void set����(String ����) {
		this.���� = ����;
	}

	public Float get��������() {
		return this.��������;
	}

	public void set��������(Float ��������) {
		this.�������� = ��������;
	}

	public Float get��������() {
		return this.��������;
	}

	public void set��������(Float ��������) {
		this.�������� = ��������;
	}

	public Float get������() {
		return this.������;
	}

	public void set������(Float ������) {
		this.������ = ������;
	}

	public Float get����() {
		return this.����;
	}

	public void set����(Float ����) {
		this.���� = ����;
	}

	public Float get����() {
		return this.����;
	}

	public void set����(Float ����) {
		this.���� = ����;
	}

	public Float get��ñ() {
		return this.��ñ;
	}

	public void set��ñ(Float ��ñ) {
		this.��ñ = ��ñ;
	}

	public Float getʧ��() {
		return this.ʧ��;
	}

	public void setʧ��(Float ʧ��) {
		this.ʧ�� = ʧ��;
	}

	public Float get����() {
		return this.����;
	}

	public void set����(Float ����) {
		this.���� = ����;
	}

	public Float get������() {
		return this.������;
	}

	public void set������(Float ������) {
		this.������ = ������;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof OridataId))
			return false;
		OridataId castOther = (OridataId) other;

		return ((this.get����() == castOther.get����())
				|| (this.get����() != null && castOther.get����() != null && this.get����().equals(castOther.get����())))
				&& ((this.getλ��() == castOther.getλ��()) || (this.getλ��() != null && castOther.getλ��() != null
						&& this.getλ��().equals(castOther.getλ��())))
				&& ((this.get����() == castOther.get����()) || (this.get����() != null && castOther.get����() != null
						&& this.get����().equals(castOther.get����())))
				&& ((this.getCountry() == castOther.getCountry()) || (this.getCountry() != null
						&& castOther.getCountry() != null && this.getCountry().equals(castOther.getCountry())))
				&& ((this.get���() == castOther.get���()) || (this.get���() != null && castOther.get���() != null
						&& this.get���().equals(castOther.get���())))
				&& ((this.get����() == castOther.get����()) || (this.get����() != null && castOther.get����() != null
						&& this.get����().equals(castOther.get����())))
				&& ((this.get���() == castOther.get���()) || (this.get���() != null && castOther.get���() != null
						&& this.get���().equals(castOther.get���())))
				&& ((this.get����() == castOther.get����()) || (this.get����() != null && castOther.get����() != null
						&& this.get����().equals(castOther.get����())))
				&& ((this.get�׷�() == castOther.get�׷�()) || (this.get�׷�() != null && castOther.get�׷�() != null
						&& this.get�׷�().equals(castOther.get�׷�())))
				&& ((this.getʱ��() == castOther.getʱ��()) || (this.getʱ��() != null && castOther.getʱ��() != null
						&& this.getʱ��().equals(castOther.getʱ��())))
				&& ((this.get����������() == castOther.get����������()) || (this.get����������() != null
						&& castOther.get����������() != null && this.get����������().equals(castOther.get����������())))
				&& ((this.get����() == castOther.get����()) || (this.get����() != null && castOther.get����() != null
						&& this.get����().equals(castOther.get����())))
				&& ((this.get����������() == castOther.get����������()) || (this.get����������() != null
						&& castOther.get����������() != null && this.get����������().equals(castOther.get����������())))
				&& ((this.get����() == castOther.get����()) || (this.get����() != null && castOther.get����() != null
						&& this.get����().equals(castOther.get����())))
				&& ((this.get����������() == castOther.get����������()) || (this.get����������() != null
						&& castOther.get����������() != null && this.get����������().equals(castOther.get����������())))
				&& ((this.get����() == castOther.get����()) || (this.get����() != null && castOther.get����() != null
						&& this.get����().equals(castOther.get����())))
				&& ((this.get��������() == castOther.get��������()) || (this.get��������() != null && castOther.get��������() != null
						&& this.get��������().equals(castOther.get��������())))
				&& ((this.get��������() == castOther.get��������()) || (this.get��������() != null && castOther.get��������() != null
						&& this.get��������().equals(castOther.get��������())))
				&& ((this.get������() == castOther.get������()) || (this.get������() != null && castOther.get������() != null
						&& this.get������().equals(castOther.get������())))
				&& ((this.get����() == castOther.get����()) || (this.get����() != null && castOther.get����() != null
						&& this.get����().equals(castOther.get����())))
				&& ((this.get����() == castOther.get����()) || (this.get����() != null && castOther.get����() != null
						&& this.get����().equals(castOther.get����())))
				&& ((this.get��ñ() == castOther.get��ñ()) || (this.get��ñ() != null && castOther.get��ñ() != null
						&& this.get��ñ().equals(castOther.get��ñ())))
				&& ((this.getʧ��() == castOther.getʧ��()) || (this.getʧ��() != null && castOther.getʧ��() != null
						&& this.getʧ��().equals(castOther.getʧ��())))
				&& ((this.get����() == castOther.get����()) || (this.get����() != null && castOther.get����() != null
						&& this.get����().equals(castOther.get����())))
				&& ((this.get������() == castOther.get������()) || (this.get������() != null && castOther.get������() != null
						&& this.get������().equals(castOther.get������())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (get����() == null ? 0 : this.get����().hashCode());
		result = 37 * result + (getλ��() == null ? 0 : this.getλ��().hashCode());
		result = 37 * result + (get����() == null ? 0 : this.get����().hashCode());
		result = 37 * result + (getCountry() == null ? 0 : this.getCountry().hashCode());
		result = 37 * result + (get���() == null ? 0 : this.get���().hashCode());
		result = 37 * result + (get����() == null ? 0 : this.get����().hashCode());
		result = 37 * result + (get���() == null ? 0 : this.get���().hashCode());
		result = 37 * result + (get����() == null ? 0 : this.get����().hashCode());
		result = 37 * result + (get�׷�() == null ? 0 : this.get�׷�().hashCode());
		result = 37 * result + (getʱ��() == null ? 0 : this.getʱ��().hashCode());
		result = 37 * result + (get����������() == null ? 0 : this.get����������().hashCode());
		result = 37 * result + (get����() == null ? 0 : this.get����().hashCode());
		result = 37 * result + (get����������() == null ? 0 : this.get����������().hashCode());
		result = 37 * result + (get����() == null ? 0 : this.get����().hashCode());
		result = 37 * result + (get����������() == null ? 0 : this.get����������().hashCode());
		result = 37 * result + (get����() == null ? 0 : this.get����().hashCode());
		result = 37 * result + (get��������() == null ? 0 : this.get��������().hashCode());
		result = 37 * result + (get��������() == null ? 0 : this.get��������().hashCode());
		result = 37 * result + (get������() == null ? 0 : this.get������().hashCode());
		result = 37 * result + (get����() == null ? 0 : this.get����().hashCode());
		result = 37 * result + (get����() == null ? 0 : this.get����().hashCode());
		result = 37 * result + (get��ñ() == null ? 0 : this.get��ñ().hashCode());
		result = 37 * result + (getʧ��() == null ? 0 : this.getʧ��().hashCode());
		result = 37 * result + (get����() == null ? 0 : this.get����().hashCode());
		result = 37 * result + (get������() == null ? 0 : this.get������().hashCode());
		return result;
	}

}