package com.hibernate;

/**
 * PtsRankId entity. @author MyEclipse Persistence Tools
 */

public class PtsRankId implements java.io.Serializable {

	// Fields

	private String ����;
	private String ��Ա;
	private String ����;
	private String ���;
	private String ����;
	private String �׷�;
	private String �÷�;
	private String λ��;
	private String ���ֳ�������;
	private String ����������;
	private String ���ֳ�������;
	private String ����������;
	private String �����������;
	private String ����������;
	private String ����ʱ��;

	// Constructors

	/** default constructor */
	public PtsRankId() {
	}

	/** full constructor */
	public PtsRankId(String ����, String ��Ա, String ����, String ���, String ����, String �׷�, String �÷�, String λ��,
			String ���ֳ�������, String ����������, String ���ֳ�������, String ����������, String �����������, String ����������, String ����ʱ��) {
		this.���� = ����;
		this.��Ա = ��Ա;
		this.���� = ����;
		this.��� = ���;
		this.���� = ����;
		this.�׷� = �׷�;
		this.�÷� = �÷�;
		this.λ�� = λ��;
		this.���ֳ������� = ���ֳ�������;
		this.���������� = ����������;
		this.���ֳ������� = ���ֳ�������;
		this.���������� = ����������;
		this.����������� = �����������;
		this.���������� = ����������;
		this.����ʱ�� = ����ʱ��;
	}

	// Property accessors

	public String get����() {
		return this.����;
	}

	public void set����(String ����) {
		this.���� = ����;
	}

	public String get��Ա() {
		return this.��Ա;
	}

	public void set��Ա(String ��Ա) {
		this.��Ա = ��Ա;
	}

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

	public String get�׷�() {
		return this.�׷�;
	}

	public void set�׷�(String �׷�) {
		this.�׷� = �׷�;
	}

	public String get�÷�() {
		return this.�÷�;
	}

	public void set�÷�(String �÷�) {
		this.�÷� = �÷�;
	}

	public String getλ��() {
		return this.λ��;
	}

	public void setλ��(String λ��) {
		this.λ�� = λ��;
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

	public String get����������() {
		return this.����������;
	}

	public void set����������(String ����������) {
		this.���������� = ����������;
	}

	public String get����ʱ��() {
		return this.����ʱ��;
	}

	public void set����ʱ��(String ����ʱ��) {
		this.����ʱ�� = ����ʱ��;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PtsRankId))
			return false;
		PtsRankId castOther = (PtsRankId) other;

		return ((this.get����() == castOther.get����())
				|| (this.get����() != null && castOther.get����() != null && this.get����().equals(castOther.get����())))
				&& ((this.get��Ա() == castOther.get��Ա()) || (this.get��Ա() != null && castOther.get��Ա() != null
						&& this.get��Ա().equals(castOther.get��Ա())))
				&& ((this.get����() == castOther.get����()) || (this.get����() != null && castOther.get����() != null
						&& this.get����().equals(castOther.get����())))
				&& ((this.get���() == castOther.get���()) || (this.get���() != null && castOther.get���() != null
						&& this.get���().equals(castOther.get���())))
				&& ((this.get����() == castOther.get����()) || (this.get����() != null && castOther.get����() != null
						&& this.get����().equals(castOther.get����())))
				&& ((this.get�׷�() == castOther.get�׷�()) || (this.get�׷�() != null && castOther.get�׷�() != null
						&& this.get�׷�().equals(castOther.get�׷�())))
				&& ((this.get�÷�() == castOther.get�÷�()) || (this.get�÷�() != null && castOther.get�÷�() != null
						&& this.get�÷�().equals(castOther.get�÷�())))
				&& ((this.getλ��() == castOther.getλ��()) || (this.getλ��() != null && castOther.getλ��() != null
						&& this.getλ��().equals(castOther.getλ��())))
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
				&& ((this.get����������() == castOther.get����������()) || (this.get����������() != null
						&& castOther.get����������() != null && this.get����������().equals(castOther.get����������())))
				&& ((this.get����ʱ��() == castOther.get����ʱ��()) || (this.get����ʱ��() != null && castOther.get����ʱ��() != null
						&& this.get����ʱ��().equals(castOther.get����ʱ��())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (get����() == null ? 0 : this.get����().hashCode());
		result = 37 * result + (get��Ա() == null ? 0 : this.get��Ա().hashCode());
		result = 37 * result + (get����() == null ? 0 : this.get����().hashCode());
		result = 37 * result + (get���() == null ? 0 : this.get���().hashCode());
		result = 37 * result + (get����() == null ? 0 : this.get����().hashCode());
		result = 37 * result + (get�׷�() == null ? 0 : this.get�׷�().hashCode());
		result = 37 * result + (get�÷�() == null ? 0 : this.get�÷�().hashCode());
		result = 37 * result + (getλ��() == null ? 0 : this.getλ��().hashCode());
		result = 37 * result + (get���ֳ�������() == null ? 0 : this.get���ֳ�������().hashCode());
		result = 37 * result + (get����������() == null ? 0 : this.get����������().hashCode());
		result = 37 * result + (get���ֳ�������() == null ? 0 : this.get���ֳ�������().hashCode());
		result = 37 * result + (get����������() == null ? 0 : this.get����������().hashCode());
		result = 37 * result + (get�����������() == null ? 0 : this.get�����������().hashCode());
		result = 37 * result + (get����������() == null ? 0 : this.get����������().hashCode());
		result = 37 * result + (get����ʱ��() == null ? 0 : this.get����ʱ��().hashCode());
		return result;
	}

}