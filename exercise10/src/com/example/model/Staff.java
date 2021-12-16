package com.example.model;

public class Staff {

	private int staffId;
	private String staffName;
	private String staffSpecialization;
	private String staffPh;
	
	public Staff() {
		super();
	}
	public Staff(int staffId, String staffName, String staffSpecialization, String staffPh) {
		super();
		this.staffId = staffId;
		this.staffName = staffName;
		this.staffSpecialization = staffSpecialization;
		this.staffPh = staffPh;
	}
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getStaffSpecialization() {
		return staffSpecialization;
	}
	public void setStaffSpecialization(String staffSpecialization) {
		this.staffSpecialization = staffSpecialization;
	}
	public String getStaffPh() {
		return staffPh;
	}
	public void setStaffPh(String staffPh) {
		this.staffPh = staffPh;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + staffId;
		result = prime * result + ((staffName == null) ? 0 : staffName.hashCode());
		result = prime * result + ((staffPh == null) ? 0 : staffPh.hashCode());
		result = prime * result + ((staffSpecialization == null) ? 0 : staffSpecialization.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Staff other = (Staff) obj;
		if (staffId != other.staffId)
			return false;
		if (staffName == null) {
			if (other.staffName != null)
				return false;
		} else if (!staffName.equals(other.staffName))
			return false;
		if (staffPh == null) {
			if (other.staffPh != null)
				return false;
		} else if (!staffPh.equals(other.staffPh))
			return false;
		if (staffSpecialization == null) {
			if (other.staffSpecialization != null)
				return false;
		} else if (!staffSpecialization.equals(other.staffSpecialization))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Staff [staffId=" + staffId + ", staffName=" + staffName + ", staffSpecialization=" + staffSpecialization
				+ ", staffPh=" + staffPh + "]";
	}
	
	
}
