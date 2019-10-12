package com.zhiyou100.model;

public class HospitalInfor {
    private String medical_record;

    private String caregiver;

    private String bed_id;

    private Double pay_the_deposit;

    private String state_illness;
    
    private Doctor doctor;
    private RegistrationInfor registrationInfor;
    private Section section;

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public RegistrationInfor getRegistrationInfor() {
		return registrationInfor;
	}

	public void setRegistrationInfor(RegistrationInfor registrationInfor) {
		this.registrationInfor = registrationInfor;
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	public String getMedical_record() {
		return medical_record;
	}

	public void setMedical_record(String medical_record) {
		this.medical_record = medical_record;
	}

	public String getCaregiver() {
		return caregiver;
	}

	public void setCaregiver(String caregiver) {
		this.caregiver = caregiver;
	}

	public String getBed_id() {
		return bed_id;
	}

	public void setBed_id(String bed_id) {
		this.bed_id = bed_id;
	}

	public Double getPay_the_deposit() {
		return pay_the_deposit;
	}

	public void setPay_the_deposit(Double pay_the_deposit) {
		this.pay_the_deposit = pay_the_deposit;
	}

	public String getState_illness() {
		return state_illness;
	}

	public void setState_illness(String state_illness) {
		this.state_illness = state_illness;
	}

	@Override
	public String toString() {
		return "HospitalInfor [medical_record=" + medical_record + ", caregiver=" + caregiver + ", bed_id=" + bed_id
				+ ", pay_the_deposit=" + pay_the_deposit + ", state_illness=" + state_illness + ", doctor=" + doctor
				+ ", registrationInfor=" + registrationInfor + ", section=" + section + ", getDoctor()=" + getDoctor()
				+ ", getRegistrationinfor()=" + getRegistrationInfor() + ", getSection()=" + getSection()
				+ ", getMedical_record()=" + getMedical_record() + ", getCaregiver()=" + getCaregiver()
				+ ", getBed_id()=" + getBed_id() + ", getPay_the_deposit()=" + getPay_the_deposit()
				+ ", getState_illness()=" + getState_illness() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}



    
}