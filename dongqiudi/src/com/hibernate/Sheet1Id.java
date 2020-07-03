package com.hibernate;

/**
 * Sheet1Id entity. @author MyEclipse Persistence Tools
 */

public class Sheet1Id implements java.io.Serializable {

	// Fields

	private String ����;
	private String ���;
	private String �ܳ���;
	private String ʤ��;
	private String ����;
	private String ����ս��;
	private String �ͳ�ս��;
	private String �����÷�;
	private String ����ʧ��;

	// Constructors

	/** default constructor */
	public Sheet1Id() {
	}

	/** full constructor */
	public Sheet1Id(String ����, String ���, String �ܳ���, String ʤ��, String ����, String ����ս��, String �ͳ�ս��, String �����÷�,
			String ����ʧ��) {
		this.���� = ����;
		this.��� = ���;
		this.�ܳ��� = �ܳ���;
		this.ʤ�� = ʤ��;
		this.���� = ����;
		this.����ս�� = ����ս��;
		this.�ͳ�ս�� = �ͳ�ս��;
		this.�����÷� = �����÷�;
		this.����ʧ�� = ����ʧ��;
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

	public String get�ܳ���() {
		return this.�ܳ���;
	}

	public void set�ܳ���(String �ܳ���) {
		this.�ܳ��� = �ܳ���;
	}

	public String getʤ��() {
		return this.ʤ��;
	}

	public void setʤ��(String ʤ��) {
		this.ʤ�� = ʤ��;
	}

	public String get����() {
		return this.����;
	}

	public void set����(String ����) {
		this.���� = ����;
	}

	public String get����ս��() {
		return this.����ս��;
	}

	public void set����ս��(String ����ս��) {
		this.����ս�� = ����ս��;
	}

	public String get�ͳ�ս��() {
		return this.�ͳ�ս��;
	}

	public void set�ͳ�ս��(String �ͳ�ս��) {
		this.�ͳ�ս�� = �ͳ�ս��;
	}

	public String get�����÷�() {
		return this.�����÷�;
	}

	public void set�����÷�(String �����÷�) {
		this.�����÷� = �����÷�;
	}

	public String get����ʧ��() {
		return this.����ʧ��;
	}

	public void set����ʧ��(String ����ʧ��) {
		this.����ʧ�� = ����ʧ��;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Sheet1Id))
			return false;
		Sheet1Id castOther = (Sheet1Id) other;

		return ((this.get����() == castOther.get����())
				|| (this.get����() != null && castOther.get����() != null && this.get����().equals(castOther.get����())))
				&& ((this.get���() == castOther.get���()) || (this.get���() != null && castOther.get���() != null
						&& this.get���().equals(castOther.get���())))
				&& ((this.get�ܳ���() == castOther.get�ܳ���()) || (this.get�ܳ���() != null && castOther.get�ܳ���() != null
						&& this.get�ܳ���().equals(castOther.get�ܳ���())))
				&& ((this.getʤ��() == castOther.getʤ��()) || (this.getʤ��() != null && castOther.getʤ��() != null
						&& this.getʤ��().equals(castOther.getʤ��())))
				&& ((this.get����() == castOther.get����()) || (this.get����() != null && castOther.get����() != null
						&& this.get����().equals(castOther.get����())))
				&& ((this.get����ս��() == castOther.get����ս��()) || (this.get����ս��() != null && castOther.get����ս��() != null
						&& this.get����ս��().equals(castOther.get����ս��())))
				&& ((this.get�ͳ�ս��() == castOther.get�ͳ�ս��()) || (this.get�ͳ�ս��() != null && castOther.get�ͳ�ս��() != null
						&& this.get�ͳ�ս��().equals(castOther.get�ͳ�ս��())))
				&& ((this.get�����÷�() == castOther.get�����÷�()) || (this.get�����÷�() != null && castOther.get�����÷�() != null
						&& this.get�����÷�().equals(castOther.get�����÷�())))
				&& ((this.get����ʧ��() == castOther.get����ʧ��()) || (this.get����ʧ��() != null && castOther.get����ʧ��() != null
						&& this.get����ʧ��().equals(castOther.get����ʧ��())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (get����() == null ? 0 : this.get����().hashCode());
		result = 37 * result + (get���() == null ? 0 : this.get���().hashCode());
		result = 37 * result + (get�ܳ���() == null ? 0 : this.get�ܳ���().hashCode());
		result = 37 * result + (getʤ��() == null ? 0 : this.getʤ��().hashCode());
		result = 37 * result + (get����() == null ? 0 : this.get����().hashCode());
		result = 37 * result + (get����ս��() == null ? 0 : this.get����ս��().hashCode());
		result = 37 * result + (get�ͳ�ս��() == null ? 0 : this.get�ͳ�ս��().hashCode());
		result = 37 * result + (get�����÷�() == null ? 0 : this.get�����÷�().hashCode());
		result = 37 * result + (get����ʧ��() == null ? 0 : this.get����ʧ��().hashCode());
		return result;
	}

}