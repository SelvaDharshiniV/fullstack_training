package com.example.model;

public class Patient {
	
	private int patientId;
	private String patientName;
	private String patientAddress;
	private String patientEmail;
	
	public Patient() {
		super();
	}
	public Patient(int patientId, String patientName, String patientAddress, String patientEmail) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientAddress = patientAddress;
		this.patientEmail = patientEmail;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientAddress() {
		return patientAddress;
	}
	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}
	public String getPatientEmail() {
		return patientEmail;
	}
	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((patientAddress == null) ? 0 : patientAddress.hashCode());
		result = prime * result + ((patientEmail == null) ? 0 : patientEmail.hashCode());
		result = prime * result + patientId;
		result = prime * result + ((patientName == null) ? 0 : patientName.hashCode());
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
		Patient other = (Patient) obj;
		if (patientAddress == null) {
			if (other.patientAddress != null)
				return false;
		} else if (!patientAddress.equals(other.patientAddress))
			return false;
		if (patientEmail == null) {
			if (other.patientEmail != null)
				return false;
		} else if (!patientEmail.equals(other.patientEmail))
			return false;
		if (patientId != other.patientId)
			return false;
		if (patientName == null) {
			if (other.patientName != null)
				return false;
		} else if (!patientName.equals(other.patientName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", patientAddress=" + patientAddress
				+ ", patientEmail=" + patientEmail + "]";
	}
	
	
}
