package com.hibernate;

/**
 * EfOfChinaId entity. @author MyEclipse Persistence Tools
 */

public class EfOfChinaId implements java.io.Serializable {

	// Fields

	private String ����;
	private String ��Ա;
	private String ����;
	private String ���;
	private String ����;
	private String �׷�;
	private String �÷�;
	private String Ч��ֵ;
	private Integer ����Ч��;
	private Integer ����Ч��;
	private String ����ʧ���;
	private String ��ʤ����ֵ;
	private String �������ع���;
	private String ʹ����;
	private String ����ֵ;
	private String ����ʱ��;

	// Constructors

	/** default constructor */
	public EfOfChinaId() {
	}

	/** full constructor */
	public EfOfChinaId(String ����, String ��Ա, String ����, String ���, String ����, String �׷�, String �÷�, String Ч��ֵ,
			Integer ����Ч��, Integer ����Ч��, String ����ʧ���, String ��ʤ����ֵ, String �������ع���, String ʹ����, String ����ֵ,
			String ����ʱ��) {
		this.���� = ����;
		this.��Ա = ��Ա;
		this.���� = ����;
		this.��� = ���;
		this.���� = ����;
		this.�׷� = �׷�;
		this.�÷� = �÷�;
		this.Ч��ֵ = Ч��ֵ;
		this.����Ч�� = ����Ч��;
		this.����Ч�� = ����Ч��;
		this.����ʧ��� = ����ʧ���;
		this.��ʤ����ֵ = ��ʤ����ֵ;
		this.�������ع��� = �������ع���;
		this.ʹ���� = ʹ����;
		this.����ֵ = ����ֵ;
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

	public String getЧ��ֵ() {
		return this.Ч��ֵ;
	}

	public void setЧ��ֵ(String Ч��ֵ) {
		this.Ч��ֵ = Ч��ֵ;
	}

	public Integer get����Ч��() {
		return this.����Ч��;
	}

	public void set����Ч��(Integer ����Ч��) {
		this.����Ч�� = ����Ч��;
	}

	public Integer get����Ч��() {
		return this.����Ч��;
	}

	public void set����Ч��(Integer ����Ч��) {
		this.����Ч�� = ����Ч��;
	}

	public String get����ʧ���() {
		return this.����ʧ���;
	}

	public void set����ʧ���(String ����ʧ���) {
		this.����ʧ��� = ����ʧ���;
	}

	public String get��ʤ����ֵ() {
		return this.��ʤ����ֵ;
	}

	public void set��ʤ����ֵ(String ��ʤ����ֵ) {
		this.��ʤ����ֵ = ��ʤ����ֵ;
	}

	public String get�������ع���() {
		return this.�������ع���;
	}

	public void set�������ع���(String �������ع���) {
		this.�������ع��� = �������ع���;
	}

	public String getʹ����() {
		return this.ʹ����;
	}

	public void setʹ����(String ʹ����) {
		this.ʹ���� = ʹ����;
	}

	public String get����ֵ() {
		return this.����ֵ;
	}

	public void set����ֵ(String ����ֵ) {
		this.����ֵ = ����ֵ;
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
		if (!(other instanceof EfOfChinaId))
			return false;
		EfOfChinaId castOther = (EfOfChinaId) other;

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
				&& ((this.getЧ��ֵ() == castOther.getЧ��ֵ()) || (this.getЧ��ֵ() != null && castOther.getЧ��ֵ() != null
						&& this.getЧ��ֵ().equals(castOther.getЧ��ֵ())))
				&& ((this.get����Ч��() == castOther.get����Ч��()) || (this.get����Ч��() != null && castOther.get����Ч��() != null
						&& this.get����Ч��().equals(castOther.get����Ч��())))
				&& ((this.get����Ч��() == castOther.get����Ч��()) || (this.get����Ч��() != null && castOther.get����Ч��() != null
						&& this.get����Ч��().equals(castOther.get����Ч��())))
				&& ((this.get����ʧ���() == castOther.get����ʧ���()) || (this.get����ʧ���() != null
						&& castOther.get����ʧ���() != null && this.get����ʧ���().equals(castOther.get����ʧ���())))
				&& ((this.get��ʤ����ֵ() == castOther.get��ʤ����ֵ()) || (this.get��ʤ����ֵ() != null
						&& castOther.get��ʤ����ֵ() != null && this.get��ʤ����ֵ().equals(castOther.get��ʤ����ֵ())))
				&& ((this.get�������ع���() == castOther.get�������ع���()) || (this.get�������ع���() != null
						&& castOther.get�������ع���() != null && this.get�������ع���().equals(castOther.get�������ع���())))
				&& ((this.getʹ����() == castOther.getʹ����()) || (this.getʹ����() != null && castOther.getʹ����() != null
						&& this.getʹ����().equals(castOther.getʹ����())))
				&& ((this.get����ֵ() == castOther.get����ֵ()) || (this.get����ֵ() != null && castOther.get����ֵ() != null
						&& this.get����ֵ().equals(castOther.get����ֵ())))
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
		result = 37 * result + (getЧ��ֵ() == null ? 0 : this.getЧ��ֵ().hashCode());
		result = 37 * result + (get����Ч��() == null ? 0 : this.get����Ч��().hashCode());
		result = 37 * result + (get����Ч��() == null ? 0 : this.get����Ч��().hashCode());
		result = 37 * result + (get����ʧ���() == null ? 0 : this.get����ʧ���().hashCode());
		result = 37 * result + (get��ʤ����ֵ() == null ? 0 : this.get��ʤ����ֵ().hashCode());
		result = 37 * result + (get�������ع���() == null ? 0 : this.get�������ع���().hashCode());
		result = 37 * result + (getʹ����() == null ? 0 : this.getʹ����().hashCode());
		result = 37 * result + (get����ֵ() == null ? 0 : this.get����ֵ().hashCode());
		result = 37 * result + (get����ʱ��() == null ? 0 : this.get����ʱ��().hashCode());
		return result;
	}

}