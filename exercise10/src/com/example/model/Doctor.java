package com.example.model;

import java.util.*;

public class Doctor {
	
	private int doctorId;
	private String doctorName;
	private String docSpecialization;
	private String location;
	
	Set<Patient> patientList;
	Map<String,Staff> staffDetails;
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(int doctorId, String doctorName, String docSpecialization, String location, Set<Patient> patientList,
			Map<String, Staff> staffDetails) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.docSpecialization = docSpecialization;
		this.location = location;
		this.patientList = patientList;
		this.staffDetails = staffDetails;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getDocSpecialization() {
		return docSpecialization;
	}
	public void setDocSpecialization(String docSpecialization) {
		this.docSpecialization = docSpecialization;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String revisedValue) {
		this.location = revisedValue;
	}
	public Set<Patient> getPatientList() {
		return patientList;
	}
	public void setPatientList(Set<Patient> patientList) {
		this.patientList = patientList;
	}
	public Map<String, Staff> getStaffDetails() {
		return staffDetails;
	}
	public void setStaffDetails(Map<String, Staff> staffDetails) {
		this.staffDetails = staffDetails;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((docSpecialization == null) ? 0 : docSpecialization.hashCode());
		result = prime * result + doctorId;
		result = prime * result + ((doctorName == null) ? 0 : doctorName.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((patientList == null) ? 0 : patientList.hashCode());
		result = prime * result + ((staffDetails == null) ? 0 : staffDetails.hashCode());
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
		Doctor other = (Doctor) obj;
		if (docSpecialization == null) {
			if (other.docSpecialization != null)
				return false;
		} else if (!docSpecialization.equals(other.docSpecialization))
			return false;
		if (doctorId != other.doctorId)
			return false;
		if (doctorName == null) {
			if (other.doctorName != null)
				return false;
		} else if (!doctorName.equals(other.doctorName))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (patientList == null) {
			if (other.patientList != null)
				return false;
		} else if (!patientList.equals(other.patientList))
			return false;
		if (staffDetails == null) {
			if (other.staffDetails != null)
				return false;
		} else if (!staffDetails.equals(other.staffDetails))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", docSpecialization="
				+ docSpecialization + ", location=" + location + ", patientList=" + patientList + ", staffDetails="
				+ staffDetails + "]";
	}
	

}

