package com.hibernate;

/**
 * Sheet3Id entity. @author MyEclipse Persistence Tools
 */

public class Sheet3Id implements java.io.Serializable {

	// Fields

	private String ����;
	private String ���;
	private String ����;
	private String �÷�;
	private String ���ֳ�������;
	private String ����������;
	private String ���ֳ�������;
	private String ����������;
	private String �����������;
	private String ������;

	// Constructors

	/** default constructor */
	public Sheet3Id() {
	}

	/** full constructor */
	public Sheet3Id(String ����, String ���, String ����, String �÷�, String ���ֳ�������, String ����������, String ���ֳ�������,
			String ����������, String �����������, String ������) {
		this.���� = ����;
		this.��� = ���;
		this.���� = ����;
		this.�÷� = �÷�;
		this.���ֳ������� = ���ֳ�������;
		this.���������� = ����������;
		this.���ֳ������� = ���ֳ�������;
		this.���������� = ����������;
		this.����������� = �����������;
		this.������ = ������;
	}

	// Property accessors

	public String get����() {
		return this.����;
	}

	public void set����(String ����) {
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

	public String get�÷�() {
		return this.�÷�;
	}

	public void set�÷�(String �÷�) {
		this.�÷� = �÷�;
	}

	public String get���ֳ�������() {
		return this.���ֳ�������;
	}

	public void set���ֳ�������(String ���ֳ�������) {
		this.���ֳ������� = ���ֳ�������;
	}

	public String get����������() {
		return this.����������;
	}

	public void set����������(String ����������) {
		this.���������� = ����������;
	}

	public String get���ֳ�������() {
		return this.���ֳ�������;
	}

	public void set���ֳ�������(String ���ֳ�������) {
		this.���ֳ������� = ���ֳ�������;
	}

	public String get����������() {
		return this.����������;
	}

	public void set����������(String ����������) {
		this.���������� = ����������;
	}

	public String get�����������() {
		return this.�����������;
	}

	public void set�����������(String �����������) {
		this.����������� = �����������;
	}

	public String get������() {
		return this.������;
	}

	public void set������(String ������) {
		this.������ = ������;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Sheet3Id))
			return false;
		Sheet3Id castOther = (Sheet3Id) other;

		return ((this.get����() == castOther.get����())
				|| (this.get����() != null && castOther.get����() != null && this.get����().equals(castOther.get����())))
				&& ((this.get���() == castOther.get���()) || (this.get���() != null && castOther.get���() != null
						&& this.get���().equals(castOther.get���())))
				&& ((this.get����() == castOther.get����()) || (this.get����() != null && castOther.get����() != null
						&& this.get����().equals(castOther.get����())))
				&& ((this.get�÷�() == castOther.get�÷�()) || (this.get�÷�() != null && castOther.get�÷�() != null
						&& this.get�÷�().equals(castOther.get�÷�())))
				&& ((this.get���ֳ�������() == castOther.get���ֳ�������()) || (this.get���ֳ�������() != null
						&& castOther.get���ֳ�������() != null && this.get���ֳ�������().equals(castOther.get���ֳ�������())))
				&& ((this.get����������() == castOther.get����������()) || (this.get����������() != null
						&& castOther.get����������() != null && this.get����������().equals(castOther.get����������())))
				&& ((this.get���ֳ�������() == castOther.get���ֳ�������()) || (this.get���ֳ�������() != null
						&& castOther.get���ֳ�������() != null && this.get���ֳ�������().equals(castOther.get���ֳ�������())))
				&& ((this.get����������() == castOther.get����������()) || (this.get����������() != null
						&& castOther.get����������() != null && this.get����������().equals(castOther.get����������())))
				&& ((this.get�����������() == castOther.get�����������()) || (this.get�����������() != null
						&& castOther.get�����������() != null && this.get�����������().equals(castOther.get�����������())))
				&& ((this.get������() == castOther.get������()) || (this.get������() != null && castOther.get������() != null
						&& this.get������().equals(castOther.get������())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (get����() == null ? 0 : this.get����().hashCode());
		result = 37 * result + (get���() == null ? 0 : this.get���().hashCode());
		result = 37 * result + (get����() == null ? 0 : this.get����().hashCode());
		result = 37 * result + (get�÷�() == null ? 0 : this.get�÷�().hashCode());
		result = 37 * result + (get���ֳ�������() == null ? 0 : this.get���ֳ�������().hashCode());
		result = 37 * result + (get����������() == null ? 0 : this.get����������().hashCode());
		result = 37 * result + (get���ֳ�������() == null ? 0 : this.get���ֳ�������().hashCode());
		result = 37 * result + (get����������() == null ? 0 : this.get����������().hashCode());
		result = 37 * result + (get�����������() == null ? 0 : this.get�����������().hashCode());
		result = 37 * result + (get������() == null ? 0 : this.get������().hashCode());
		return result;
	}

}